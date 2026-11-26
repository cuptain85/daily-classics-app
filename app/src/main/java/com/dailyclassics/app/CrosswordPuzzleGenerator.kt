package com.dailyclassics.app

import kotlin.random.Random

data class CrosswordPlacedEntry(
    val number: Int,
    val clue: String,
    val answer: String,
    val cells: List<Int>,
    val across: Boolean,
    val difficulty: Int
)

data class DailyCrosswordPuzzle(
    val dateKey: String,
    /** '#' marks a blocked square; every answer square is '.' before the player fills it. */
    val blankGrid: String,
    /** Solution letters at answer squares, '#' at blocked squares. */
    val solutionGrid: String,
    val entries: List<CrosswordPlacedEntry>
)

private data class CrosswordPlacement(
    val word: CrosswordWord,
    val row: Int,
    val col: Int,
    val across: Boolean
) {
    fun cells(size: Int): List<Int> = word.answer.indices.map { offset ->
        if (across) row * size + col + offset else (row + offset) * size + col
    }
}

object CrosswordPuzzleGenerator {
    private const val SIZE = 13
    private const val EMPTY = '\u0000'

    fun forDate(dateKey: String): DailyCrosswordPuzzle = generate(dateKey, dateKey.hashCode())

    fun generate(dateKey: String, seed: Int): DailyCrosswordPuzzle {
        val bank = CrosswordWordBank.entries.filter { it.answer.length in 3..9 }
        require(bank.size >= 100) { "Crossword word bank is not available" }
        val random = Random(seed)
        val pool = bank.shuffled(random)
        val startChoices = pool.filter { it.answer.length in 5..8 }
        val first = startChoices[random.nextInt(startChoices.size)]
        val board = CharArray(SIZE * SIZE) { EMPTY }
        val firstCol = (SIZE - first.answer.length) / 2
        val placements = mutableListOf(CrosswordPlacement(first, SIZE / 2, firstCol, true))
        first.answer.forEachIndexed { offset, letter -> board[(SIZE / 2) * SIZE + firstCol + offset] = letter }
        val used = mutableSetOf(first.answer)

        var attempts = 0
        var cursor = 0
        while (placements.size < 18 && attempts < 18000 && cursor < pool.size * 5) {
            attempts++
            val candidate = pool[cursor % pool.size]
            cursor++
            if (candidate.answer in used || candidate.answer.length !in 3..9) continue

            val options = mutableListOf<CrosswordPlacement>()
            for (existing in placements.shuffled(random)) {
                val across = !existing.across
                val existingCells = existing.cells(SIZE)
                for (existingOffset in existingCells.indices) {
                    val cell = existingCells[existingOffset]
                    val row = cell / SIZE
                    val col = cell % SIZE
                    for (wordOffset in candidate.answer.indices) {
                        if (candidate.answer[wordOffset] != board[cell]) continue
                        val startRow = if (across) row else row - wordOffset
                        val startCol = if (across) col - wordOffset else col
                        val placement = CrosswordPlacement(candidate, startRow, startCol, across)
                        if (canPlace(placement, board, placements)) options.add(placement)
                    }
                }
            }
            if (options.isEmpty()) continue
            val best = options.maxByOrNull { placement ->
                placement.cells(SIZE).count { cell -> board[cell] != EMPTY }
            } ?: continue
            best.cells(SIZE).forEachIndexed { index, cell ->
                val existing = board[cell]
                if (existing == EMPTY) board[cell] = best.word.answer[index]
            }
            placements.add(best)
            used.add(best.word.answer)
        }

        // If a seed produces a tight grid, continue with a few shorter entries before returning it.
        if (placements.size < 7) {
            for (candidate in pool) {
                if (placements.size >= 7) break
                if (candidate.answer in used || candidate.answer.length !in 3..6) continue
                val options = mutableListOf<CrosswordPlacement>()
                for (existing in placements) {
                    val across = !existing.across
                    for (cell in existing.cells(SIZE)) {
                        val row = cell / SIZE
                        val col = cell % SIZE
                        for (offset in candidate.answer.indices) {
                            if (candidate.answer[offset] != board[cell]) continue
                            val placement = CrosswordPlacement(
                                candidate,
                                if (across) row else row - offset,
                                if (across) col - offset else col,
                                across
                            )
                            if (canPlace(placement, board, placements)) options.add(placement)
                        }
                    }
                }
                val best = options.firstOrNull() ?: continue
                best.cells(SIZE).forEachIndexed { i, cell -> if (board[cell] == EMPTY) board[cell] = best.word.answer[i] }
                placements.add(best)
                used.add(best.word.answer)
            }
        }

        val startCells = placements.map { it.row * SIZE + it.col }.distinct().sorted()
        val numbers = startCells.mapIndexed { index, cell -> cell to index + 1 }.toMap()
        val entries = placements.map { placement ->
            CrosswordPlacedEntry(
                number = numbers.getValue(placement.row * SIZE + placement.col),
                clue = placement.word.clue,
                answer = placement.word.answer,
                cells = placement.cells(SIZE),
                across = placement.across,
                difficulty = placement.word.difficulty
            )
        }.sortedWith(compareBy<CrosswordPlacedEntry> { it.number }.thenByDescending { it.across })

        val solution = String(board.map { if (it == EMPTY) '#' else it }.toCharArray())
        val blank = String(solution.map { if (it == '#') '#' else '.' }.toCharArray())
        return DailyCrosswordPuzzle(dateKey, blank, solution, entries)
    }

    private fun canPlace(
        candidate: CrosswordPlacement,
        board: CharArray,
        existing: List<CrosswordPlacement>
    ): Boolean {
        val length = candidate.word.answer.length
        if (candidate.row < 0 || candidate.col < 0) return false
        if (candidate.across) {
            if (candidate.col + length > SIZE || candidate.row >= SIZE) return false
        } else {
            if (candidate.row + length > SIZE || candidate.col >= SIZE) return false
        }
        val cells = candidate.cells(SIZE)
        val first = cells.first()
        val last = cells.last()
        val before = if (candidate.across) first - 1 else first - SIZE
        val after = if (candidate.across) last + 1 else last + SIZE
        if (candidate.across) {
            if (candidate.col > 0 && board[before] != EMPTY) return false
            if (candidate.col + length < SIZE && board[after] != EMPTY) return false
        } else {
            if (candidate.row > 0 && board[before] != EMPTY) return false
            if (candidate.row + length < SIZE && board[after] != EMPTY) return false
        }

        var intersections = 0
        for (offset in cells.indices) {
            val cell = cells[offset]
            val letter = candidate.word.answer[offset]
            val current = board[cell]
            if (current != EMPTY) {
                if (current != letter) return false
                val belongsToPerpendicular = existing.any { placement ->
                    placement.across != candidate.across && cell in placement.cells(SIZE)
                }
                if (!belongsToPerpendicular) return false
                intersections++
            } else {
                val row = cell / SIZE
                val col = cell % SIZE
                val sideOne = if (candidate.across) row - 1 else col - 1
                val sideTwo = if (candidate.across) row + 1 else col + 1
                if (candidate.across) {
                    if (row > 0 && board[sideOne * SIZE + col] != EMPTY) return false
                    if (row + 1 < SIZE && board[sideTwo * SIZE + col] != EMPTY) return false
                } else {
                    if (col > 0 && board[row * SIZE + sideOne] != EMPTY) return false
                    if (col + 1 < SIZE && board[row * SIZE + sideTwo] != EMPTY) return false
                }
            }
        }
        return intersections > 0
    }
}
