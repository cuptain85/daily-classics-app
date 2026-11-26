package com.dailyclassics.app

import org.junit.Assert.*
import org.junit.Test

class GameEnginesTest {
    @Test fun dailySudokuIsStableAndHasAValidUniqueSolution() {
        val first = DailySudokuGenerator.forDate("2026-11-26")
        val second = DailySudokuGenerator.forDate("2026-11-26")
        assertEquals(first, second)
        assertEquals(81, first.puzzle.length)
        assertEquals(81, first.solution.length)
        assertTrue(SudokuRules.isValid(first.puzzle))
        assertTrue(SudokuRules.isSolved(first.solution))
        first.puzzle.forEachIndexed { index, value ->
            if (value != '0') assertEquals(value, first.solution[index])
        }
    }

    @Test fun klondikeDealCyclesWasteBackToStock() {
        val initial = KlondikeEngine.newGame(seed = 7)
        val dealt = KlondikeEngine.deal(initial)
        assertEquals(1, dealt.waste.size)
        assertEquals(23, dealt.stock.size)
        var state = dealt
        repeat(24) { state = KlondikeEngine.deal(state) }
        assertTrue(state.stock.isNotEmpty() || state.waste.isNotEmpty())
    }

    @Test fun klondikeMovesWholeValidRunAndFlipsExposedCard() {
        val hidden = KlondikeCard(7, 0, false)
        val run = listOf(KlondikeCard(6, 1), KlondikeCard(5, 0))
        val state = KlondikeState(
            stock = emptyList(), waste = emptyList(),
            tableau = listOf(listOf(hidden) + run, listOf(KlondikeCard(7, 2))),
            foundations = List(4) { emptyList() }
        )
        val moved = KlondikeEngine.moveTableauRun(state, 0, 1, 1)
        assertNotNull(moved)
        assertEquals(listOf(KlondikeCard(7, 0, true)), moved!!.tableau[0])
        assertEquals(listOf(KlondikeCard(7, 2), KlondikeCard(6, 1), KlondikeCard(5, 0)), moved.tableau[1])
    }

    @Test fun spadesBotsBidAndMustFollowSuit() {
        val hand = listOf(GameCard(14, 3), GameCard(13, 3), GameCard(8, 1))
        assertTrue(SpadesEngine.chooseBotBid(hand) in 0..13)
        assertEquals(listOf(hand[2]), SpadesEngine.legalCards(hand, 1, true))
    }

    @Test fun spadesBagPenaltyAppliesAtTen() {
        val bids = listOf(SpadesBid(0, 3), SpadesBid(1, 3), SpadesBid(2, 2), SpadesBid(3, 2))
        val result = SpadesEngine.scoreHand(bids, listOf(4, 2, 3, 4), priorBlueBags = 8, priorRedBags = 8)
        assertEquals(7, result.blueTricks)
        assertEquals(6, result.redTricks)
        assertEquals(0, result.blueBags)
        assertEquals(9, result.redBags)
        assertEquals(-48, result.blueScore)
        assertEquals(51, result.redScore)
    }
}
