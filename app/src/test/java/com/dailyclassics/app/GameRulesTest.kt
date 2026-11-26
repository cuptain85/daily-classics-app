package com.dailyclassics.app

import org.junit.Assert.*
import org.junit.Test

class GameRulesTest {
    @Test fun sudokuAcceptsValidPartialBoardAndRejectsRowConflict() {
        val valid = "530070000600195000098000060800060003400803001700020006060000280000419005000080079"
        assertTrue(SudokuRules.isValid(valid))
        assertFalse(SudokuRules.isValid(valid.replaceRange(1, 2, "5")))
    }

    @Test fun sudokuNotesToggleIndividually() {
        val first = SudokuRules.toggleNote(emptySet(), 4)
        assertEquals(setOf(4), first)
        assertEquals(emptySet<Int>(), SudokuRules.toggleNote(first, 4))
    }

    @Test fun tableauRequiresDescendingAlternatingColors() {
        assertTrue(KlondikeRules.canPlaceOnTableau(GameCard(8, 1), GameCard(9, 0)))
        assertFalse(KlondikeRules.canPlaceOnTableau(GameCard(8, 1), GameCard(9, 2)))
        assertTrue(KlondikeRules.canPlaceOnTableau(GameCard(13, 0), null))
        assertFalse(KlondikeRules.canPlaceOnTableau(GameCard(12, 1), null))
    }

    @Test fun foundationBuildsAceThroughKingInSameSuit() {
        assertTrue(KlondikeRules.canPlaceOnFoundation(GameCard(1, 3), null))
        assertTrue(KlondikeRules.canPlaceOnFoundation(GameCard(2, 3), GameCard(1, 3)))
        assertFalse(KlondikeRules.canPlaceOnFoundation(GameCard(2, 2), GameCard(1, 3)))
    }

    @Test fun spadesRequiresFollowingSuitWhenPossible() {
        val hand = listOf(GameCard(4, 0), GameCard(8, 1), GameCard(2, 0))
        assertEquals(listOf(hand[0], hand[2]), SpadesRules.legalCards(hand, 0))
        assertEquals(hand, SpadesRules.legalCards(hand, 3))
    }

    @Test fun spadesTrumpBeatsHigherOffSuitAndScoresBags() {
        val plays = listOf(0 to GameCard(13, 0), 1 to GameCard(2, 3), 2 to GameCard(1, 0))
        assertEquals(1, SpadesRules.trickWinner(plays, 0))
        assertEquals(32, SpadesRules.handScore(3, 5))
        assertEquals(-30, SpadesRules.handScore(3, 2))
    }
}
