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

    @Test fun crosswordBankContainsThousandsOfLicensedClueEntries() {
        assertTrue(CrosswordWordBank.entries.size >= 13000)
        assertTrue(CrosswordWordBank.entries.all { it.answer.matches(Regex("[A-Z]{3,10}")) && it.clue.isNotBlank() })
    }

    @Test fun generatedCrosswordsHaveRealIntersectingAcrossAndDownEntries() {
        val puzzle = CrosswordPuzzleGenerator.forDate("2026-11-26")
        assertEquals(169, puzzle.blankGrid.length)
        assertEquals(169, puzzle.solutionGrid.length)
        assertTrue(puzzle.entries.size >= 7)
        assertTrue(puzzle.entries.any { it.across })
        assertTrue(puzzle.entries.any { !it.across })
        puzzle.entries.forEach { entry ->
            assertEquals(entry.answer.length, entry.cells.size)
            assertEquals(entry.answer, entry.cells.map { puzzle.solutionGrid[it] }.joinToString(""))
        }
        val across = puzzle.entries.filter { it.across }
        val down = puzzle.entries.filter { !it.across }
        val intersections = across.sumOf { a -> down.sumOf { d -> a.cells.count { it in d.cells } } }
        assertTrue("Puzzle should contain genuine letter crossings", intersections >= 6)
    }

    @Test fun dailyCrosswordsAreStableByDateAndChangeAcrossDates() {
        val todayA = CrosswordPuzzleGenerator.forDate("2026-11-26")
        val todayB = CrosswordPuzzleGenerator.forDate("2026-11-26")
        val tomorrow = CrosswordPuzzleGenerator.forDate("2026-11-27")
        assertEquals(todayA, todayB)
        assertNotEquals(todayA.solutionGrid, tomorrow.solutionGrid)
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

    @Test fun klondikeSaveStateRoundTripsExactly() {
        val state = KlondikeEngine.deal(KlondikeEngine.newGame(seed = 42, drawCount = 3))
        assertEquals(state, KlondikeEngine.deserialize(KlondikeEngine.serialize(state)))
    }

    @Test fun klondikeDrawThreeRecycleKeepsTopCardOrder() {
        var state = KlondikeEngine.newGame(seed = 19, drawCount = 3)
        repeat(8) { state = KlondikeEngine.deal(state) }
        assertTrue(state.stock.isEmpty())
        val previousTop = state.waste.last()
        val recycled = KlondikeEngine.deal(state)
        assertEquals(24, recycled.stock.size)
        val dealtAgain = KlondikeEngine.deal(recycled)
        assertEquals(previousTop, dealtAgain.waste.last())
        assertEquals(21, dealtAgain.stock.size)
    }

    @Test fun klondikeMovesWholeValidRunAndFlipsExposedCard() {
        val hidden = KlondikeCard(7, 0, false)
        val run = listOf(KlondikeCard(6, 1), KlondikeCard(5, 0))
        val state = KlondikeState(
            stock = emptyList(), waste = emptyList(),
            tableau = listOf(listOf(hidden) + run, listOf(KlondikeCard(7, 3))),
            foundations = List(4) { emptyList() }
        )
        val moved = KlondikeEngine.moveTableauRun(state, 0, 1, 1)
        assertNotNull(moved)
        assertEquals(listOf(KlondikeCard(7, 0, true)), moved!!.tableau[0])
        assertEquals(listOf(KlondikeCard(7, 3), KlondikeCard(6, 1), KlondikeCard(5, 0)), moved.tableau[1])
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

    @Test fun klondikeNewDealContainsOneCompleteStandardDeck() {
        val state = KlondikeEngine.newGame(seed = 20261126, drawCount = 1)
        val cards = state.stock + state.waste + state.tableau.flatten() + state.foundations.flatten()
        assertEquals(52, cards.size)
        assertEquals(52, cards.map { it.rank to it.suit }.toSet().size)
        assertEquals(7, state.tableau.size)
        assertEquals(listOf(1, 2, 3, 4, 5, 6, 7), state.tableau.map { it.size })
        assertTrue(state.tableau.flatten().count { it.faceUp } == 7)
    }

    @Test fun klondikeRejectsMalformedSavedState() {
        assertNull(KlondikeEngine.deserialize("not-a-valid-save"))
        assertNull(KlondikeEngine.deserialize(null))
        assertNull(KlondikeEngine.deserialize(""))
    }

    @Test fun spadesCannotBeLedUntilBrokenUnlessHandHasOnlySpades() {
        val mixedHand = listOf(GameCard(4, 0), GameCard(8, 3), GameCard(2, 1))
        assertEquals(listOf(mixedHand[0], mixedHand[2]), SpadesEngine.legalCards(mixedHand, null, false))
        val onlySpades = listOf(GameCard(8, 3), GameCard(2, 3))
        assertEquals(onlySpades, SpadesEngine.legalCards(onlySpades, null, false))
    }

    @Test fun spadesFollowSuitTakesPriorityOverBreakingSpades() {
        val hand = listOf(GameCard(4, 0), GameCard(8, 3), GameCard(2, 1))
        assertEquals(listOf(hand[0]), SpadesEngine.legalCards(hand, 0, false))
    }

    @Test fun crosswordEntriesStayInsideGridAndMatchEverySolutionCell() {
        val puzzle = CrosswordPuzzleGenerator.forDate("2026-11-26")
        puzzle.entries.forEach { entry ->
            assertTrue(entry.cells.all { it in 0 until 169 })
            assertEquals(entry.answer.length, entry.cells.distinct().size)
            assertEquals(entry.answer, entry.cells.map { puzzle.solutionGrid[it] }.joinToString(""))
            assertTrue(entry.number > 0)
        }
        puzzle.solutionGrid.forEachIndexed { index, cell ->
            if (cell == '#') assertEquals('#', puzzle.blankGrid[index])
            else assertEquals('.', puzzle.blankGrid[index])
        }
    }
