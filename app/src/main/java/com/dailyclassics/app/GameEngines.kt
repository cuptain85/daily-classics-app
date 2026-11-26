package com.dailyclassics.app

import kotlin.random.Random

/** Deterministic daily Sudoku generation. A date always produces the same puzzle. */
data class SudokuDailyPuzzle(val dateKey: String, val puzzle: String, val solution: String)

object DailySudokuGenerator {
    fun forDate(dateKey: String): SudokuDailyPuzzle {
        val seed = dateKey.hashCode()
        val random = Random(seed)
        val digits = (1..9).shuffled(random)
        val bands = (0..2).shuffled(random).flatMap { band ->
            (0..2).shuffled(random).map { band * 3 + it }
        }
        val stacks = (0..2).shuffled(random).flatMap { stack ->
            (0..2).shuffled(random).map { stack * 3 + it }
        }
        val solution = buildString(81) {
            bands.forEach { r ->
                stacks.forEach { c ->
                    val pattern = (r * 3 + r / 3 + c) % 9
                    append(digits[pattern])
                }
            }
        }
        val puzzle = solution.toCharArray()
        val positions = (0 until 81).shuffled(random)
        var removed = 0
        for (position in positions) {
            if (removed >= 42) break
            val previous = puzzle[position]
            puzzle[position] = '0'
            if (countSolutions(String(puzzle), limit = 2) == 1) removed++
            else puzzle[position] = previous
        }
        return SudokuDailyPuzzle(dateKey, String(puzzle), solution)
    }

    private fun countSolutions(board: String, limit: Int): Int {
        val cells = board.toCharArray()
        fun candidates(index: Int): List<Char> {
            val row = index / 9
            val col = index % 9
            val used = mutableSetOf<Char>()
            for (i in 0..8) {
                used += cells[row * 9 + i]
                used += cells[i * 9 + col]
            }
            val br = row / 3 * 3
            val bc = col / 3 * 3
            for (r in br until br + 3) for (c in bc until bc + 3) used += cells[r * 9 + c]
            return ('1'..'9').filter { it !in used }
        }
        fun solve(): Int {
            var best = -1
            var options: List<Char> = emptyList()
            for (i in cells.indices) if (cells[i] == '0') {
                val next = candidates(i)
                if (next.isEmpty()) return 0
                if (best < 0 || next.size < options.size) {
                    best = i
                    options = next
                    if (next.size == 1) break
                }
            }
            if (best < 0) return 1
            var total = 0
            for (digit in options) {
                cells[best] = digit
                total += solve()
                if (total >= limit) break
            }
            cells[best] = '0'
            return total
        }
        return solve()
    }
}

data class KlondikeCard(val rank: Int, val suit: Int, val faceUp: Boolean = true) {
    init { require(rank in 1..13 && suit in 0..3) }
    val isRed: Boolean get() = suit == 1 || suit == 2
    val label: String get() = (when (rank) { 1 -> "A"; 11 -> "J"; 12 -> "Q"; 13 -> "K"; else -> rank.toString() }) +
        listOf("♣", "♦", "♥", "♠")[suit]
}

data class KlondikeState(
    val stock: List<KlondikeCard>,
    val waste: List<KlondikeCard>,
    val tableau: List<List<KlondikeCard>>,
    val foundations: List<List<KlondikeCard>>,
    val moves: Int = 0,
    val score: Int = 0,
    val drawCount: Int = 1
) {
    val isWon: Boolean get() = foundations.all { it.size == 13 }
}

object KlondikeEngine {
    fun serialize(state: KlondikeState): String {
        fun pile(cards: List<KlondikeCard>) = cards.joinToString(",") { "${it.rank}.${it.suit}.${if (it.faceUp) 1 else 0}" }
        return listOf(
            pile(state.stock), pile(state.waste),
            state.tableau.joinToString("/") { pile(it) },
            state.foundations.joinToString("/") { pile(it) },
            state.moves.toString(), state.score.toString(), state.drawCount.toString()
        ).joinToString("~")
    }

    fun deserialize(raw: String?): KlondikeState? {
        if (raw.isNullOrBlank()) return null
        return try {
            val parts = raw.split("~", limit = 7)
            if (parts.size != 7) null else {
                fun pile(value: String): List<KlondikeCard> =
                    if (value.isEmpty()) emptyList() else value.split(",").map { token ->
                        val fields = token.split(".")
                        require(fields.size == 3)
                        require(fields[2] == "0" || fields[2] == "1")
                        KlondikeCard(fields[0].toInt(), fields[1].toInt(), fields[2] == "1")
                    }
                val tableau = parts[2].split("/", limit = 7).map { pile(it) }
                val foundations = parts[3].split("/", limit = 4).map { pile(it) }
                val draw = parts[6].toInt()
                val moves = parts[4].toInt()
                val score = parts[5].toInt()
                if (tableau.size != 7 || foundations.size != 4 || (draw != 1 && draw != 3) ||
                    moves < 0 || score < 0) null
                else {
                    val state = KlondikeState(pile(parts[0]), pile(parts[1]), tableau, foundations, moves, score, draw)
                    val cards = state.stock + state.waste + state.tableau.flatten() + state.foundations.flatten()
                    val uniqueCards = cards.map { it.rank to it.suit }.toSet()
                    if (cards.size != 52 || uniqueCards.size != 52) null else state
                }
            }
        } catch (_: Exception) {
            null
        }
    }

    fun newGame(seed: Int, drawCount: Int = 1): KlondikeState {
        require(drawCount == 1 || drawCount == 3)
        val deck = (0..3).flatMap { suit -> (1..13).map { rank -> KlondikeCard(rank, suit) } }.shuffled(Random(seed))
        var cursor = 0
        val piles = (0..6).map { column ->
            (0..column).map { row -> deck[cursor++].copy(faceUp = row == column) }
        }
        return KlondikeState(deck.drop(cursor).map { it.copy(faceUp = false) }, emptyList(), piles, List(4) { emptyList() }, drawCount = drawCount)
    }

    fun deal(state: KlondikeState): KlondikeState {
        if (state.stock.isEmpty()) {
            if (state.waste.isEmpty()) return state
            return state.copy(stock = state.waste.map { it.copy(faceUp = false) }, waste = emptyList(), moves = state.moves + 1)
        }
        val count = minOf(state.drawCount, state.stock.size)
        val dealt = state.stock.takeLast(count).map { it.copy(faceUp = true) }
        return state.copy(stock = state.stock.dropLast(count), waste = state.waste + dealt, moves = state.moves + 1)
    }

    fun moveWasteToTableau(state: KlondikeState, destination: Int): KlondikeState? {
        if (destination !in 0..6 || state.waste.isEmpty()) return null
        val card = state.waste.last()
        val target = state.tableau[destination].lastOrNull()
        if (!canTableau(card, target)) return null
        val piles = state.tableau.map { it.toMutableList() }
        piles[destination].add(card)
        return state.copy(waste = state.waste.dropLast(1), tableau = piles, moves = state.moves + 1, score = state.score + 5)
    }

    fun moveWasteToFoundation(state: KlondikeState): KlondikeState? {
        if (state.waste.isEmpty()) return null
        val card = state.waste.last()
        val foundation = state.foundations[card.suit]
        if (!canFoundation(card, foundation.lastOrNull())) return null
        val foundations = state.foundations.map { it.toMutableList() }
        foundations[card.suit].add(card)
        return state.copy(waste = state.waste.dropLast(1), foundations = foundations, moves = state.moves + 1, score = state.score + 10)
    }

    /** Moves a face-up run beginning at sourceIndex to another tableau column. */
    fun moveTableauRun(state: KlondikeState, source: Int, sourceIndex: Int, destination: Int): KlondikeState? {
        if (source !in 0..6 || destination !in 0..6 || source == destination) return null
        val from = state.tableau[source]
        if (sourceIndex !in from.indices || !from[sourceIndex].faceUp) return null
        val run = from.drop(sourceIndex)
        if (run.zipWithNext().any { (a, b) -> a.rank != b.rank + 1 || a.isRed == b.isRed }) return null
        if (!canTableau(run.first(), state.tableau[destination].lastOrNull())) return null
        val piles = state.tableau.map { it.toMutableList() }
        piles[destination].addAll(run)
        piles[source].subList(sourceIndex, piles[source].size).clear()
        if (piles[source].isNotEmpty() && !piles[source].last().faceUp) {
            piles[source][piles[source].lastIndex] = piles[source].last().copy(faceUp = true)
        }
        return state.copy(tableau = piles, moves = state.moves + 1, score = state.score + if (sourceIndex == from.lastIndex) 5 else 0)
    }

    fun moveTableauToFoundation(state: KlondikeState, column: Int): KlondikeState? {
        if (column !in 0..6) return null
        val card = state.tableau[column].lastOrNull() ?: return null
        if (!card.faceUp || !canFoundation(card, state.foundations[card.suit].lastOrNull())) return null
        val piles = state.tableau.map { it.toMutableList() }
        piles[column].removeAt(piles[column].lastIndex)
        if (piles[column].isNotEmpty() && !piles[column].last().faceUp) {
            piles[column][piles[column].lastIndex] = piles[column].last().copy(faceUp = true)
        }
        val foundations = state.foundations.map { it.toMutableList() }
        foundations[card.suit].add(card)
        return state.copy(tableau = piles, foundations = foundations, moves = state.moves + 1, score = state.score + 10)
    }

    fun moveFoundationToTableau(state: KlondikeState, suit: Int, destination: Int): KlondikeState? {
        if (suit !in 0..3 || destination !in 0..6) return null
        val foundation = state.foundations[suit]
        val card = foundation.lastOrNull() ?: return null
        if (!canTableau(card, state.tableau[destination].lastOrNull())) return null
        val foundations = state.foundations.map { it.toMutableList() }
        foundations[suit].removeAt(foundations[suit].lastIndex)
        val piles = state.tableau.map { it.toMutableList() }
        piles[destination].add(card)
        return state.copy(foundations = foundations, tableau = piles, moves = state.moves + 1, score = (state.score - 15).coerceAtLeast(0))
    }

    private fun canTableau(card: KlondikeCard, target: KlondikeCard?): Boolean =
        if (target == null) card.rank == 13 else target.faceUp && card.rank == target.rank - 1 && card.isRed != target.isRed

    private fun canFoundation(card: KlondikeCard, top: KlondikeCard?): Boolean =
        if (top == null) card.rank == 1 else top.suit == card.suit && card.rank == top.rank + 1
}

data class SpadesBid(val player: Int, val tricks: Int) {
    init { require(player in 0..3 && tricks in 0..13) }
}

data class SpadesPlay(val player: Int, val card: GameCard)

data class SpadesHandResult(
    val blueTricks: Int,
    val redTricks: Int,
    val blueBid: Int,
    val redBid: Int,
    val blueScore: Int,
    val redScore: Int,
    val blueBags: Int,
    val redBags: Int
)

object SpadesEngine {
    fun chooseBotBid(hand: List<GameCard>): Int {
        val highCards = hand.sumOf { card ->
            when (card.rank) {
                14 -> 1.0
                13 -> if (hand.any { it.suit == card.suit && it.rank == 14 }) 0.7 else 0.5
                12 -> if (hand.any { it.suit == card.suit && it.rank >= 13 }) 0.35 else 0.15
                else -> 0.0
            }
        }
        val spades = hand.filter { it.suit == 3 }
        val trumpStrength = spades.count { it.rank >= 11 } * 0.5 + (spades.size - 3).coerceAtLeast(0) * 0.25
        return (highCards + trumpStrength).toInt().coerceIn(0, 13)
    }

    fun legalCards(hand: List<GameCard>, ledSuit: Int?, spadesBroken: Boolean): List<GameCard> {
        val follow = SpadesRules.legalCards(hand, ledSuit)
        if (ledSuit == null && !spadesBroken && follow.any { it.suit != 3 }) return follow.filter { it.suit != 3 }
        return follow
    }

    fun winner(plays: List<SpadesPlay>, ledSuit: Int): Int =
        SpadesRules.trickWinner(plays.map { it.player to it.card }, ledSuit)

    fun scoreHand(bids: List<SpadesBid>, tricksByPlayer: List<Int>, priorBlueBags: Int, priorRedBags: Int): SpadesHandResult {
        require(bids.size == 4 && tricksByPlayer.size == 4)
        val blueBid = bids.filter { it.player % 2 == 0 }.sumOf { it.tricks }
        val redBid = bids.filter { it.player % 2 == 1 }.sumOf { it.tricks }
        val blueTricks = tricksByPlayer[0] + tricksByPlayer[2]
        val redTricks = tricksByPlayer[1] + tricksByPlayer[3]
        val blueRaw = SpadesRules.handScore(blueBid, blueTricks)
        val redRaw = SpadesRules.handScore(redBid, redTricks)
        val blueBagTotal = priorBlueBags + if (blueTricks >= blueBid) blueTricks - blueBid else 0
        val redBagTotal = priorRedBags + if (redTricks >= redBid) redTricks - redBid else 0
        val bluePenalty = (blueBagTotal / 10 - priorBlueBags / 10) * 100
        val redPenalty = (redBagTotal / 10 - priorRedBags / 10) * 100
        return SpadesHandResult(blueTricks, redTricks, blueBid, redBid,
            blueRaw - bluePenalty, redRaw - redPenalty, blueBagTotal % 10, redBagTotal % 10)
    }
}
