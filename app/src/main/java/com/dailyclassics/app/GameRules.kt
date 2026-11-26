package com.dailyclassics.app

/** Shared, deterministic rules used by the four game screens and unit tests. */
object SudokuRules {
    fun isValid(board: String): Boolean {
        if (board.length != 81 || board.any { it !in '0'..'9' }) return false
        for (i in 0 until 9) {
            val row = (0 until 9).map { board[i * 9 + it] }.filter { it != '0' }
            val col = (0 until 9).map { board[it * 9 + i] }.filter { it != '0' }
            if (row.size != row.toSet().size || col.size != col.toSet().size) return false
        }
        for (br in 0..2) for (bc in 0..2) {
            val box = buildList {
                for (r in 0..2) for (c in 0..2) {
                    val value = board[(br * 3 + r) * 9 + bc * 3 + c]
                    if (value != '0') add(value)
                }
            }
            if (box.size != box.toSet().size) return false
        }
        return true
    }

    fun isSolved(board: String): Boolean =
        board.length == 81 && board.none { it == '0' } && isValid(board)

    fun toggleNote(notes: Set<Int>, number: Int): Set<Int> {
        require(number in 1..9)
        return if (number in notes) notes - number else notes + number
    }
}

data class GameCard(val rank: Int, val suit: Int) {
    init { require(rank in 1..13); require(suit in 0..3) }
    val isRed: Boolean get() = suit == 1 || suit == 2
}

object KlondikeRules {
    /** Tableau: descending rank, alternating color; empty columns accept kings only. */
    fun canPlaceOnTableau(moving: GameCard, target: GameCard?): Boolean =
        if (target == null) moving.rank == 13
        else moving.rank == target.rank - 1 && moving.isRed != target.isRed

    /** Foundation piles build upward in one suit, starting with an ace. */
    fun canPlaceOnFoundation(moving: GameCard, top: GameCard?): Boolean =
        if (top == null) moving.rank == 1
        else moving.suit == top.suit && moving.rank == top.rank + 1
}

object SpadesRules {
    /** A player must follow the led suit when holding at least one card of it. */
    fun legalCards(hand: List<GameCard>, ledSuit: Int?): List<GameCard> {
        if (ledSuit == null || hand.none { it.suit == ledSuit }) return hand
        return hand.filter { it.suit == ledSuit }
    }

    /** Returns the winning player index. Spades trump; otherwise highest led-suit card wins. */
    fun trickWinner(plays: List<Pair<Int, GameCard>>, ledSuit: Int): Int {
        require(plays.isNotEmpty())
        val winning = plays.maxWithOrNull(
            compareBy<Pair<Int, GameCard>> { if (it.second.suit == 3) 2 else if (it.second.suit == ledSuit) 1 else 0 }
                .thenBy { it.second.rank }
        )!!
        return winning.first
    }

    /** Standard partnership score for one team's bid and tricks won. */
    fun handScore(bid: Int, tricks: Int): Int {
        require(bid >= 0 && tricks in 0..13)
        return if (tricks >= bid) bid * 10 + (tricks - bid)
        else -bid * 10
    }
}
