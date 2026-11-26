package com.dailyclassics.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random
import java.time.LocalDate

private val Blue = Color(0xFF1769D2)
private val DeepBlue = Color(0xFF104A9B)
private val Green = Color(0xFF35B66A)
private val Pale = Color(0xFFEAF3FF)
private val Ink = Color(0xFF17324D)
private val Felt = Color(0xFF176B49)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val prefs = getSharedPreferences("daily_classics", MODE_PRIVATE)
        setContent {
            MaterialTheme {
                var page by remember { mutableStateOf("Home") }
                var drawThree by remember { mutableStateOf(prefs.getBoolean("draw3", false)) }
                Surface(Modifier.fillMaxSize(), color = Pale) {
                    when (page) {
                        "Home" -> Home(
                            onGame = { page = it },
                            onSettings = { page = "Settings" }
                        )
                        "Sudoku" -> SudokuScreen(onBack = { page = "Home" }, prefs = prefs)
                        "Crossword" -> CrosswordScreen(onBack = { page = "Home" }, prefs = prefs)
                        "Spades" -> SpadesScreen(onBack = { page = "Home" })
                        "Solitaire" -> SolitaireScreen(onBack = { page = "Home" }, drawThree = drawThree)
                        "Settings" -> SettingsScreen(
                            drawThree = drawThree,
                            onDrawThree = {
                                drawThree = it
                                prefs.edit().putBoolean("draw3", it).apply()
                            },
                            onBack = { page = "Home" }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun Home(onGame: (String) -> Unit, onSettings: () -> Unit) {
    val games = listOf(
        Triple("Sudoku", "Daily number puzzle", "9"),
        Triple("Crossword", "Daily word puzzle", "✎"),
        Triple("Spades", "You + Dewey vs. Huey + Louie", "♠"),
        Triple("Solitaire", "Classic Klondike", "A")
    )
    Column(Modifier.fillMaxSize().padding(18.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(Modifier.weight(1f)) {
                Text("DAILY CLASSICS", color = DeepBlue, fontSize = 13.sp, fontWeight = FontWeight.Bold, letterSpacing = 2.sp)
                Text("A little play every day.", color = Ink, fontSize = 23.sp, fontWeight = FontWeight.Bold)
            }
            Text("⚙", Modifier.background(Color.White, CircleShape).clickable { onSettings() }.padding(13.dp), color = DeepBlue, fontSize = 22.sp)
        }
        Spacer(Modifier.height(16.dp))
        Card(colors = CardDefaults.cardColors(containerColor = Blue), shape = RoundedCornerShape(22.dp)) {
            Row(Modifier.fillMaxWidth().padding(18.dp), verticalAlignment = Alignment.CenterVertically) {
                Column(Modifier.weight(1f)) {
                    Text("YOUR DAILY BREAK", color = Color(0xFFD8E9FF), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                    Text("Four classics.\nOne place to play.", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                }
                Text("🎮", fontSize = 42.sp)
            }
        }
        Spacer(Modifier.height(18.dp))
        Text("CHOOSE A GAME", color = DeepBlue, fontWeight = FontWeight.Bold, letterSpacing = 1.5.sp)
        Spacer(Modifier.height(10.dp))
        Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            games.chunked(2).forEach { pair ->
                Row(Modifier.weight(1f), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    pair.forEachIndexed { index, game ->
                        val color = if ((games.indexOf(game)) % 2 == 0) Blue else Green
                        Card(
                            onClick = { onGame(game.first) },
                            modifier = Modifier.weight(1f).fillMaxHeight(),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            shape = RoundedCornerShape(20.dp)
                        ) {
                            Column(Modifier.fillMaxSize().padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                                Box(Modifier.size(54.dp).background(color, RoundedCornerShape(16.dp)), contentAlignment = Alignment.Center) {
                                    Text(game.third, color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.Bold)
                                }
                                Spacer(Modifier.height(8.dp))
                                Text(game.first, color = Ink, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                                Text(game.second, color = Color.Gray, fontSize = 10.sp, textAlign = TextAlign.Center)
                                Spacer(Modifier.height(10.dp))
                                Text("Open game  •  Calendar", color = DeepBlue, fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                            }
                        }
                    }
                }
            }
        }
        Spacer(Modifier.height(12.dp))
        Card(colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp)) {
            Row(Modifier.fillMaxWidth().padding(14.dp), verticalAlignment = Alignment.CenterVertically) {
                Text("🏆", fontSize = 25.sp)
                Column(Modifier.padding(start = 10.dp)) {
                    Text("Your progress", color = Ink, fontWeight = FontWeight.Bold)
                    Text("Game progress is saved on this device.", color = Color.Gray, fontSize = 11.sp)
                }
            }
        }
    }
}

@Composable
private fun GameHeader(title: String, onBack: () -> Unit, extra: String = "") {
    Row(Modifier.fillMaxWidth().padding(bottom = 12.dp), verticalAlignment = Alignment.CenterVertically) {
        Text("‹", Modifier.clickable { onBack() }.padding(end = 16.dp), color = DeepBlue, fontSize = 34.sp)
        Column {
            Text(title, color = DeepBlue, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            if (extra.isNotEmpty()) Text(extra, color = Color.Gray, fontSize = 11.sp)
        }
    }
}

@Composable
private fun SudokuScreen(onBack: () -> Unit, prefs: android.content.SharedPreferences) {
    var date by remember { mutableStateOf(LocalDate.now()) }
    val daily = remember(date) { DailySudokuGenerator.forDate(date.toString()) }
    val puzzle = daily.puzzle
    val solution = daily.solution
    val cells = remember(date) { mutableStateListOf<Char>().apply {
        (prefs.getString("sudoku_" + daily.dateKey, null) ?: puzzle).forEach { add(it) }
    } }
    val notes = remember(date) { mutableStateMapOf<Int, String>().apply {
        prefs.getString("sudoku_notes_" + daily.dateKey, "").orEmpty().split(";").forEach { item ->
            val parts = item.split("=")
            if (parts.size == 2) parts[0].toIntOrNull()?.let { index -> if (index in 0..80) put(index, parts[1]) }
        }
    } }
    val undo = remember(date) { mutableStateListOf<Pair<String, Map<Int, String>>>() }
    val redo = remember(date) { mutableStateListOf<Pair<String, Map<Int, String>>>() }
    var selected by remember(date) { mutableIntStateOf(0) }
    var notesMode by remember { mutableStateOf(false) }
    var message by remember(date) { mutableStateOf("Fill each row, column and 3×3 box with 1–9.") }

    fun snapshot(): Pair<String, Map<Int, String>> = cells.joinToString("") to notes.toMap()
    fun rememberChange() {
        undo.add(snapshot())
        if (undo.size > 100) undo.removeAt(0)
        redo.clear()
    }
    fun persist() {
        prefs.edit()
            .putString("sudoku_" + daily.dateKey, cells.joinToString(""))
            .putString("sudoku_notes_" + daily.dateKey, notes.entries.joinToString(";") { "${it.key}=${it.value}" })
            .apply()
    }
    fun restore(snapshot: Pair<String, Map<Int, String>>) {
        cells.indices.forEach { cells[it] = snapshot.first[it] }
        notes.clear()
        notes.putAll(snapshot.second)
        persist()
    }

    Column(Modifier.fillMaxSize().padding(14.dp)) {
        GameHeader("Daily Sudoku", onBack, "Puzzle for ${daily.dateKey}")
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            OutlinedButton(onClick = { date = date.minusDays(1) }, contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)) { Text("‹ Previous") }
            Text(if (date == LocalDate.now()) "Today" else date.toString(), color = DeepBlue, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            OutlinedButton(onClick = { date = date.plusDays(1) }, contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)) { Text("Next ›") }
        }
        Text(message, color = Ink, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        Column(Modifier.fillMaxWidth().aspectRatio(1f).background(DeepBlue).padding(2.dp)) {
            for (r in 0..8) {
                Row(Modifier.weight(1f)) {
                    for (c in 0..8) {
                        val i = r * 9 + c
                        val fixed = puzzle[i] != '0'
                        val chosen = selected == i
                        val conflict = cells[i] != '0' && cells.indices.any { other ->
                            other != i && cells[other] == cells[i] &&
                                (other / 9 == i / 9 || other % 9 == i % 9 ||
                                    (other / 27 == i / 27 && other % 9 / 3 == i % 9 / 3))
                        }
                        Box(
                            Modifier.weight(1f).fillMaxHeight().padding(0.5.dp)
                                .background(when { chosen -> Color(0xFFB8D9FF); conflict -> Color(0xFFFFDADA); else -> Color.White })
                                .clickable { selected = i },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                if (cells[i] != '0') cells[i].toString() else notes[i].orEmpty(),
                                color = if (fixed) DeepBlue else if (conflict) Color.Red else Ink,
                                fontSize = if (notes[i] != null && cells[i] == '0') 8.sp else 18.sp,
                                fontWeight = if (fixed) FontWeight.Bold else FontWeight.Normal
                            )
                        }
                    }
                }
            }
        }
        Spacer(Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            Button(onClick = { notesMode = !notesMode }, colors = ButtonDefaults.buttonColors(containerColor = if (notesMode) Green else Blue), modifier = Modifier.weight(1f)) { Text(if (notesMode) "Notes ON" else "Notes OFF") }
            OutlinedButton(onClick = {
                rememberChange()
                cells.indices.forEach { if (puzzle[it] == '0') { cells[it] = '0'; notes.remove(it) } }
                persist()
                message = "Your entries and notes were cleared."
            }, modifier = Modifier.weight(1f)) { Text("Clear") }
            OutlinedButton(onClick = {
                val board = cells.joinToString("")
                message = when {
                    !SudokuRules.isValid(board) -> "There are duplicate numbers in a row, column or box."
                    SudokuRules.isSolved(board) && board == solution -> "Excellent! Puzzle solved."
                    else -> "No conflicts found so far. Keep going!"
                }
            }, modifier = Modifier.weight(1f)) { Text("Check") }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            OutlinedButton(onClick = {
                if (undo.isNotEmpty()) {
                    redo.add(snapshot())
                    restore(undo.removeAt(undo.lastIndex))
                    message = "Last change undone."
                } else message = "Nothing to undo."
            }, modifier = Modifier.weight(1f)) { Text("Undo") }
            OutlinedButton(onClick = {
                if (redo.isNotEmpty()) {
                    undo.add(snapshot())
                    restore(redo.removeAt(redo.lastIndex))
                    message = "Change restored."
                } else message = "Nothing to redo."
            }, modifier = Modifier.weight(1f)) { Text("Redo") }
        }
        for (row in 0..2) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                for (col in 1..3) {
                    val n = row * 3 + col
                    Button(onClick = {
                        if (puzzle[selected] == '0') {
                            rememberChange()
                            if (notesMode) {
                                val digit = ('0'.code + n).toChar()
                                val current = notes[selected].orEmpty()
                                val updated = if (digit in current) current.filterNot { it == digit } else current + digit
                                if (updated.isEmpty()) notes.remove(selected) else notes[selected] = updated
                            } else {
                                cells[selected] = ('0'.code + n).toChar()
                                notes.remove(selected)
                            }
                            persist()
                        }
                    }, modifier = Modifier.weight(1f), contentPadding = PaddingValues(4.dp)) { Text(n.toString(), fontSize = 19.sp) }
                }
            }
        }
        Text("Selected square: row ${selected / 9 + 1}, column ${selected % 9 + 1}", color = Color.Gray, fontSize = 11.sp, modifier = Modifier.padding(top = 6.dp))
    }
}

@Composable
private fun CrosswordScreen(onBack: () -> Unit, prefs: android.content.SharedPreferences) {
    data class Entry(val number: Int, val clue: String, val answer: String, val cells: List<Int>, val across: Boolean)
    val entries = remember {
        val result = mutableListOf<Entry>()
        fun add(number: Int, clue: String, answer: String, row: Int, col: Int, across: Boolean) {
            val cells = answer.indices.map { offset -> if (across) row * 13 + col + offset else (row + offset) * 13 + col }
            result.add(Entry(number, clue, answer, cells, across))
        }
        add(1, "A puzzle of numbered clues and intersecting answers", "CROSSWORD", 6, 2, true)
        add(2, "The same kind of word puzzle, running vertically", "CROSSWORD", 2, 6, false)
        add(3, "Do something; take action", "ACT", 2, 5, true)
        add(4, "Creative work", "ART", 3, 5, true)
        add(5, "Opposite of cold", "HOT", 4, 5, true)
        add(6, "Opposite of cold", "HOT", 8, 5, true)
        add(7, "Creative work", "ART", 9, 5, true)
        add(8, "Put together; calculate a sum", "ADD", 10, 5, true)
        add(9, "Perform on stage", "ACT", 5, 2, false)
        add(10, "Painting, sculpture, or drawing", "ART", 5, 3, false)
        add(11, "Warm to the touch", "HOT", 5, 4, false)
        add(12, "Opposite of cold", "HOT", 5, 8, false)
        add(13, "Creative work", "ART", 5, 9, false)
        add(14, "Combine numbers", "ADD", 5, 10, false)
        result
    }
    val blocked = remember {
        val mask = MutableList(169) { true }
        entries.forEach { entry -> entry.cells.forEach { mask[it] = false } }
        mask
    }
    val solutionGrid = remember {
        CharArray(169) { if (blocked[it]) '#' else '.' }.also { grid ->
            entries.forEach { entry -> entry.cells.forEachIndexed { index, cell -> grid[cell] = entry.answer[index] } }
        }
    }
    var date by remember { mutableStateOf(LocalDate.now()) }
    val savedKey = "crossword_" + date.toString()
    val cells = remember(date) {
        mutableStateListOf<Char>().apply {
            val saved = prefs.getString(savedKey, null)
            (saved?.takeIf { it.length == 169 } ?: String(CharArray(169) { if (blocked[it]) '#' else '.' })).forEach { add(it) }
        }
    }
    var activeIndex by remember(date) { mutableIntStateOf(0) }
    var selectedCell by remember(date) { mutableIntStateOf(entries[0].cells.first()) }
    var lastTappedCell by remember(date) { mutableIntStateOf(-1) }
    var message by remember(date) { mutableStateOf("Tap a square or a clue. Fill the answers with the letter keys.") }
    val clueListState = rememberLazyListState()
    LaunchedEffect(activeIndex) { clueListState.animateScrollToItem(activeIndex) }
    val active = entries[activeIndex]

    fun selectCell(cell: Int) {
        if (blocked[cell]) return
        val options = entries.indices.filter { cell in entries[it].cells }
        if (options.isNotEmpty()) {
            val sameCellAgain = lastTappedCell == cell
            val current = options.indexOf(activeIndex)
            val next = if (sameCellAgain && options.size > 1) options[(current + 1).mod(options.size)] else options.firstOrNull { entries[it].across == active.across } ?: options.first()
            activeIndex = next
            selectedCell = cell
            lastTappedCell = cell
        }
    }
    fun save() { prefs.edit().putString(savedKey, cells.joinToString("")).apply() }
    fun enterLetter(letter: Char) {
        if (blocked[selectedCell]) return
        cells[selectedCell] = letter
        save()
        val position = active.cells.indexOf(selectedCell)
        if (position >= 0 && position < active.cells.lastIndex) selectedCell = active.cells[position + 1]
    }
    fun eraseLetter() {
        if (!blocked[selectedCell]) {
            cells[selectedCell] = '.'
            save()
        }
    }

    Column(Modifier.fillMaxSize().padding(10.dp)) {
        GameHeader("Daily Crossword", onBack, "13 × 13 mini puzzle  •  ${date}")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            OutlinedButton(onClick = { date = date.minusDays(1) }, contentPadding = PaddingValues(horizontal = 10.dp, vertical = 3.dp)) { Text("‹ Previous") }
            Text(if (date == LocalDate.now()) "Today" else date.toString(), color = DeepBlue, fontSize = 11.sp, fontWeight = FontWeight.Bold)
            OutlinedButton(onClick = { date = date.plusDays(1) }, contentPadding = PaddingValues(horizontal = 10.dp, vertical = 3.dp)) { Text("Next ›") }
        }
        Card(colors = CardDefaults.cardColors(containerColor = Color.White)) {
            Column(Modifier.fillMaxWidth().padding(9.dp)) {
                Text("${active.number} ${if (active.across) "Across" else "Down"}", color = DeepBlue, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                Text(active.clue, color = Ink, fontWeight = FontWeight.SemiBold, fontSize = 13.sp)
            }
        }
        Text(message, color = Color.Gray, fontSize = 10.sp, modifier = Modifier.padding(vertical = 5.dp))
        Column(Modifier.fillMaxWidth().aspectRatio(1f).background(DeepBlue).padding(1.dp)) {
            for (row in 0 until 13) {
                Row(Modifier.weight(1f)) {
                    for (col in 0 until 13) {
                        val cell = row * 13 + col
                        val isBlocked = blocked[cell]
                        val isActive = cell in active.cells
                        Box(
                            Modifier.weight(1f).fillMaxHeight().padding(0.5.dp)
                                .background(when { isBlocked -> DeepBlue; cell == selectedCell -> Color(0xFFFFD76A); isActive -> Color(0xFFB8D9FF); else -> Color.White })
                                .clickable { selectCell(cell) },
                            contentAlignment = Alignment.Center
                        ) {
                            if (!isBlocked) Text(cells[cell].takeIf { it != '.' && it != '#' }?.toString() ?: "", color = Ink, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
        Text("CLUES — tap to jump to an answer", color = DeepBlue, fontWeight = FontWeight.Bold, fontSize = 11.sp, modifier = Modifier.padding(vertical = 5.dp))
        LazyColumn(state = clueListState, modifier = Modifier.weight(1f)) {
            items(entries) { entry ->
                val index = entries.indexOf(entry)
                Text("${entry.number} ${if (entry.across) "Across" else "Down"}  •  ${entry.clue} (${entry.answer.length})",
                    Modifier.fillMaxWidth().clickable { activeIndex = index; selectedCell = entry.cells.first(); lastTappedCell = -1 }
                        .background(if (index == activeIndex) Color(0xFFD8E9FF) else Color.Transparent)
                        .padding(horizontal = 8.dp, vertical = 6.dp),
                    color = Ink, fontSize = 10.sp, fontWeight = if (index == activeIndex) FontWeight.Bold else FontWeight.Normal)
            }
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(3.dp)) {
            ('A'..'M').forEach { letter ->
                Text(letter.toString(), Modifier.weight(1f).background(Color.White, RoundedCornerShape(4.dp)).clickable { enterLetter(letter) }.padding(vertical = 8.dp), textAlign = TextAlign.Center, color = DeepBlue, fontSize = 11.sp, fontWeight = FontWeight.Bold)
            }
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(3.dp)) {
            ('N'..'Z').forEach { letter ->
                Text(letter.toString(), Modifier.weight(1f).background(Color.White, RoundedCornerShape(4.dp)).clickable { enterLetter(letter) }.padding(vertical = 8.dp), textAlign = TextAlign.Center, color = DeepBlue, fontSize = 11.sp, fontWeight = FontWeight.Bold)
            }
            Text("⌫", Modifier.weight(1f).background(Color(0xFFFFE0E0), RoundedCornerShape(4.dp)).clickable { eraseLetter() }.padding(vertical = 8.dp), textAlign = TextAlign.Center, color = Color.Red, fontSize = 11.sp, fontWeight = FontWeight.Bold)
        }
        OutlinedButton(onClick = {
            val correct = entries.all { entry -> entry.cells.map { cells[it] }.joinToString("") == entry.answer }
            message = if (correct) "Perfect! You completed the crossword." else "Not quite yet. Keep filling the crossing answers."
        }, modifier = Modifier.fillMaxWidth()) { Text("Check puzzle") }
    }
}

private data class PlayingCard(val rank: Int, val suit: Int, val faceUp: Boolean = true) {
    val symbol get() = listOf("♣", "♦", "♥", "♠")[suit]
    val label get() = (when (rank) { 14 -> "A"; 13 -> "K"; 12 -> "Q"; 11 -> "J"; else -> rank.toString() }) + symbol
    val red get() = suit == 1 || suit == 2
}

@Composable
private fun SolitaireScreen(onBack: () -> Unit, drawThree: Boolean) {
    var game by remember { mutableStateOf(KlondikeEngine.newGame(System.currentTimeMillis().toInt(), if (drawThree) 3 else 1)) }
    val history = remember { mutableStateListOf<KlondikeState>() }
    val redoHistory = remember { mutableStateListOf<KlondikeState>() }
    var selectedWaste by remember { mutableStateOf(false) }
    var selectedTableau by remember { mutableStateOf<Pair<Int, Int>?>(null) }
    var selectedFoundation by remember { mutableIntStateOf(-1) }
    var message by remember { mutableStateOf("Tap the stock to deal. Select a card, then its destination.") }

    fun commit(next: KlondikeState?) {
        if (next == null) {
            message = "That move is not allowed."
        } else {
            history.add(game)
            redoHistory.clear()
            game = next
            selectedWaste = false
            selectedTableau = null
            selectedFoundation = -1
            message = if (next.isWon) "You won! All four foundations are complete." else "Good move."
        }
    }

    Column(Modifier.fillMaxSize().background(Felt).padding(10.dp)) {
        GameHeader("Klondike Solitaire", onBack, "Score: ${game.score}   Moves: ${game.moves}")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("STOCK", color = Color.White, fontSize = 9.sp)
                Text(if (game.stock.isEmpty()) "↻" else "▧", Modifier.background(Color(0xFF0E4B37), RoundedCornerShape(7.dp)).clickable {
                    history.add(game); redoHistory.clear(); game = KlondikeEngine.deal(game)
                    selectedWaste = false; selectedTableau = null; selectedFoundation = -1
                    message = if (game.stock.isEmpty() && game.waste.isEmpty()) "No cards left to deal." else "Cards dealt."
                }.padding(horizontal = 18.dp, vertical = 14.dp), color = Color.White, fontSize = 22.sp)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("WASTE", color = Color.White, fontSize = 9.sp)
                Text(game.waste.lastOrNull()?.label ?: "—", Modifier.background(if (selectedWaste) Color(0xFFFFE39B) else Color.White, RoundedCornerShape(7.dp)).clickable {
                    if (game.waste.isNotEmpty()) {
                        selectedWaste = true; selectedTableau = null; selectedFoundation = -1
                        message = "Waste card selected. Tap a tableau column or foundation."
                    }
                }.padding(horizontal = 14.dp, vertical = 14.dp), color = game.waste.lastOrNull()?.let { if (it.isRed) Color.Red else Ink } ?: Ink, fontWeight = FontWeight.Bold)
            }
            game.foundations.forEachIndexed { suit, pile ->
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("FOUND.", color = Color.White, fontSize = 8.sp)
                    val top = pile.lastOrNull()
                    Text(top?.label ?: listOf("♣", "♦", "♥", "♠")[suit],
                        Modifier.background(if (selectedFoundation == suit) Color(0xFFFFE39B) else Color(0xFF0E4B37), RoundedCornerShape(7.dp)).clickable {
                            if (selectedWaste) commit(KlondikeEngine.moveWasteToFoundation(game))
                            else if (selectedTableau != null && selectedTableau!!.second == game.tableau[selectedTableau!!.first].lastIndex) {
                                commit(KlondikeEngine.moveTableauToFoundation(game, selectedTableau!!.first))
                            } else if (selectedTableau == null) {
                                selectedFoundation = suit; selectedWaste = false
                                message = "Foundation selected. Tap a tableau column to move its top card back."
                            } else message = "Only a tableau top card can move to a foundation."
                        }.padding(horizontal = 9.dp, vertical = 14.dp),
                        color = if (top?.isRed == true) Color(0xFFFFB4B4) else Color.White, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                }
            }
        }
        Text(message, color = Color.White, fontSize = 11.sp, modifier = Modifier.padding(vertical = 9.dp))
        Row(Modifier.fillMaxWidth().weight(1f), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            game.tableau.forEachIndexed { column, pile ->
                Column(Modifier.weight(1f).fillMaxHeight().background(Color(0xFF1B7652), RoundedCornerShape(5.dp)).clickable {
                    if (selectedFoundation >= 0) {
                        commit(KlondikeEngine.moveFoundationToTableau(game, selectedFoundation, column))
                    } else if (selectedWaste) {
                        commit(KlondikeEngine.moveWasteToTableau(game, column))
                    } else if (selectedTableau != null) {
                        val source = selectedTableau!!
                        if (source.first == column) {
                            selectedTableau = null
                            message = "Selection cleared."
                        } else commit(KlondikeEngine.moveTableauRun(game, source.first, source.second, column))
                    } else {
                        val top = pile.lastIndex
                        if (top >= 0 && pile[top].faceUp) {
                            selectedTableau = column to top
                            message = "Selected ${pile[top].label}. Tap another column or its foundation."
                        }
                    }
                }.padding(2.dp), verticalArrangement = Arrangement.spacedBy(3.dp)) {
                    if (pile.isEmpty()) Text("K", Modifier.fillMaxWidth().background(Color(0xFF0E4B37), RoundedCornerShape(4.dp)).padding(vertical = 10.dp), color = Color.White, textAlign = TextAlign.Center, fontSize = 10.sp)
                    pile.forEachIndexed { index, card ->
                        Text(if (card.faceUp) card.label else "▧",
                            Modifier.fillMaxWidth().background(
                                if (selectedTableau == (column to index)) Color(0xFFFFE39B) else Color.White,
                                RoundedCornerShape(4.dp)
                            ).clickable {
                                if (card.faceUp) {
                                    if (selectedFoundation >= 0) commit(KlondikeEngine.moveFoundationToTableau(game, selectedFoundation, column))
                                    else if (selectedWaste) commit(KlondikeEngine.moveWasteToTableau(game, column))
                                    else if (selectedTableau != null && selectedTableau!!.first != column) {
                                        val source = selectedTableau!!
                                        commit(KlondikeEngine.moveTableauRun(game, source.first, source.second, column))
                                    } else {
                                        selectedTableau = column to index
                                        selectedWaste = false
                                        message = "Selected run beginning with ${card.label}."
                                    }
                                }
                            }.padding(vertical = 8.dp),
                            color = if (!card.faceUp) Color.White else if (card.isRed) Color.Red else Ink,
                            textAlign = TextAlign.Center, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(7.dp), modifier = Modifier.padding(top = 8.dp)) {
            OutlinedButton(onClick = {
                if (history.isNotEmpty()) {
                    redoHistory.add(game)
                    game = history.removeAt(history.lastIndex)
                    selectedWaste = false; selectedTableau = null; selectedFoundation = -1
                    message = "Last move undone."
                } else message = "No moves to undo yet."
            }, modifier = Modifier.weight(1f)) { Text("Undo") }
            OutlinedButton(onClick = {
                if (redoHistory.isNotEmpty()) {
                    history.add(game)
                    game = redoHistory.removeAt(redoHistory.lastIndex)
                    selectedWaste = false; selectedTableau = null; selectedFoundation = -1
                    message = "Move redone."
                } else message = "Nothing to redo yet."
            }, modifier = Modifier.weight(1f)) { Text("Redo") }
            OutlinedButton(onClick = {
                val top = game.waste.lastOrNull()
                val move = when {
                    top != null && KlondikeEngine.moveWasteToFoundation(game) != null -> "Move ${top.label} to its foundation."
                    else -> game.tableau.indexOfFirst { pile -> pile.lastOrNull()?.let { it.faceUp && KlondikeEngine.moveTableauToFoundation(game, game.tableau.indexOf(pile)) != null } == true }.takeIf { it >= 0 }?.let { "Move the top card of column ${it + 1} to its foundation." }
                }
                message = move ?: "Try uncovering face-down cards and moving Kings to empty columns."
            }, modifier = Modifier.weight(1f)) { Text("Hint") }
            Button(onClick = {
                history.clear(); redoHistory.clear()
                game = KlondikeEngine.newGame(System.currentTimeMillis().toInt(), if (drawThree) 3 else 1)
                selectedWaste = false; selectedTableau = null; selectedFoundation = -1
                message = "New game dealt."
            }, modifier = Modifier.weight(1f)) { Text("New deal") }
        }
    }
}

@Composable
private fun SpadesScreen(onBack: () -> Unit) {
    val names = listOf("You", "Huey", "Dewey", "Louie")
    var handNumber by remember { mutableIntStateOf(1) }
    var hands = remember {
        mutableStateListOf<List<GameCard>>().apply {
            val deck = (0..3).flatMap { suit -> (2..14).map { rank -> GameCard(rank, suit) } }.shuffled()
            repeat(4) { player -> add(deck.drop(player * 13).sortedWith(compareBy<GameCard> { it.suit }.thenBy { it.rank })) }
        }
    }
    val bids = remember { mutableStateListOf<SpadesBid>() }
    val plays = remember { mutableStateListOf<SpadesPlay>() }
    val tricks = remember { mutableStateListOf<Int>().apply { repeat(4) { add(0) } } }
    var phase by remember { mutableStateOf("bid") }
    var selectedBid by remember { mutableIntStateOf(3) }
    var currentPlayer by remember { mutableIntStateOf(0) }
    var ledSuit by remember { mutableIntStateOf(-1) }
    var spadesBroken by remember { mutableStateOf(false) }
    var blueScore by remember { mutableIntStateOf(0) }
    var redScore by remember { mutableIntStateOf(0) }
    var blueBags by remember { mutableIntStateOf(0) }
    var redBags by remember { mutableIntStateOf(0) }
    var message by remember { mutableStateOf("Place your bid. You and Dewey are the blue partnership.") }

    fun startNextHand() {
        handNumber++
        val deck = (0..3).flatMap { suit -> (2..14).map { rank -> GameCard(rank, suit) } }.shuffled()
        hands.clear()
        repeat(4) { player -> hands.add(deck.drop(player * 13).sortedWith(compareBy<GameCard> { it.suit }.thenBy { it.rank })) }
        bids.clear()
        plays.clear()
        repeat(4) { tricks[it] = 0 }
        currentPlayer = 0
        ledSuit = -1
        spadesBroken = false
        phase = "bid"
        message = "Hand $handNumber. Place your bid."
    }

    fun placeBids() {
        bids.clear()
        bids.add(SpadesBid(0, selectedBid))
        for (player in 1..3) bids.add(SpadesBid(player, SpadesEngine.chooseBotBid(hands[player])))
        phase = "play"
        currentPlayer = 0
        message = "Bids are in. You lead the first trick."
    }

    fun playOne(player: Int, card: GameCard) {
        if (ledSuit < 0) ledSuit = card.suit
        if (card.suit == 3) spadesBroken = true
        hands[player] = hands[player].filterNot { it == card }
        plays.add(SpadesPlay(player, card))
        if (plays.size == 4) {
            val winner = SpadesEngine.winner(plays.toList(), ledSuit)
            tricks[winner] = tricks[winner] + 1
            message = "${names[winner]} wins the trick."
            currentPlayer = winner
            plays.clear()
            ledSuit = -1
            if (hands.all { it.isEmpty() }) {
                val result = SpadesEngine.scoreHand(bids.toList(), tricks.toList(), blueBags, redBags)
                blueScore += result.blueScore
                redScore += result.redScore
                blueBags = result.blueBags
                redBags = result.redBags
                phase = "roundComplete"
                message = "Hand complete — Blue: ${result.blueTricks} tricks, bid ${result.blueBid}, score ${result.blueScore}. Red: ${result.redTricks} tricks, bid ${result.redBid}, score ${result.redScore}."
                if (blueScore >= 500 || redScore >= 500) {
                    message += if (blueScore > redScore) " Blue wins the match!" else " Red wins the match!"
                    phase = "matchComplete"
                }
            }
        } else {
            currentPlayer = (player + 1) % 4
        }
    }

    fun playUserCard(card: GameCard) {
        if (phase != "play" || currentPlayer != 0) return
        val legal = SpadesEngine.legalCards(hands[0], ledSuit.takeIf { it >= 0 }, spadesBroken)
        if (card !in legal) {
            message = if (ledSuit >= 0) "You must follow suit when you can." else "Spades cannot be led until broken, unless you hold only spades."
            return
        }
        playOne(0, card)
        while (phase == "play" && currentPlayer != 0) {
            val player = currentPlayer
            val options = SpadesEngine.legalCards(hands[player], ledSuit.takeIf { it >= 0 }, spadesBroken)
            val chosen = if (plays.size == 0) {
                options.filter { it.suit != 3 }.minByOrNull { it.rank } ?: options.minByOrNull { it.rank }
            } else {
                options.minByOrNull { it.rank }
            } ?: break
            playOne(player, chosen)
        }
        if (phase == "play" && currentPlayer == 0) message = "Your turn. Follow suit if possible."
    }

    fun cardLabel(card: GameCard): String =
        (when (card.rank) { 14 -> "A"; 13 -> "K"; 12 -> "Q"; 11 -> "J"; else -> card.rank.toString() }) +
            listOf("♣", "♦", "♥", "♠")[card.suit]

    Column(Modifier.fillMaxSize().background(Color(0xFFE9F2FC)).padding(12.dp)) {
        GameHeader("Partnership Spades", onBack, "Hand $handNumber  •  You + Dewey vs. Huey + Louie")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            ScoreBox("SCORE", blueScore, blueBags, redScore, redBags)
            Column(horizontalAlignment = Alignment.End) {
                Text("Huey  •  Red  •  Bid ${bids.firstOrNull { it.player == 1 }?.tricks ?: "—"}", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold, fontSize = 11.sp)
                Text("Dewey  •  Blue  •  Bid ${bids.firstOrNull { it.player == 2 }?.tricks ?: "—"}", color = DeepBlue, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                Text("Louie  •  Red  •  Bid ${bids.firstOrNull { it.player == 3 }?.tricks ?: "—"}", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold, fontSize = 11.sp)
            }
        }
        Spacer(Modifier.height(8.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text("Blue tricks: ${tricks[0] + tricks[2]}", color = DeepBlue, fontWeight = FontWeight.Bold)
            Text("Red tricks: ${tricks[1] + tricks[3]}", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold)
        }
        if (phase == "bid") {
            Card(Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color.White)) {
                Column(Modifier.padding(14.dp)) {
                    Text("YOUR BID", color = DeepBlue, fontWeight = FontWeight.Bold)
                    Text("Choose how many tricks you expect your partnership to take.", color = Color.Gray, fontSize = 11.sp)
                    Row(Modifier.horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                        (0..13).forEach { bid ->
                            Text(bid.toString(), Modifier.background(if (selectedBid == bid) Blue else Pale, RoundedCornerShape(8.dp)).clickable { selectedBid = bid }.padding(horizontal = 11.dp, vertical = 10.dp), color = if (selectedBid == bid) Color.White else Ink, fontWeight = FontWeight.Bold)
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = { placeBids() }, modifier = Modifier.fillMaxWidth()) { Text("Place bid") }
                }
            }
        } else {
            Card(Modifier.fillMaxWidth().weight(1f), colors = CardDefaults.cardColors(containerColor = Color(0xFF277B55)), shape = RoundedCornerShape(18.dp)) {
                Column(Modifier.fillMaxSize().padding(12.dp), verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("DEWEY  •  BLUE", color = Color.White, fontWeight = FontWeight.Bold)
                    Text(plays.firstOrNull { it.player == 2 }?.let { cardLabel(it.card) } ?: "🂠", color = Color.White, fontSize = 26.sp)
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("HUEY", color = Color.White, fontSize = 10.sp)
                            Text(plays.firstOrNull { it.player == 1 }?.let { cardLabel(it.card) } ?: "🂠", color = Color.White, fontSize = 24.sp)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("LOUIE", color = Color.White, fontSize = 10.sp)
                            Text(plays.firstOrNull { it.player == 3 }?.let { cardLabel(it.card) } ?: "🂠", color = Color.White, fontSize = 24.sp)
                        }
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("YOUR PLAY", color = Color.White, fontSize = 10.sp)
                        Text(plays.firstOrNull { it.player == 0 }?.let { cardLabel(it.card) } ?: "Your turn", color = Color.White, fontSize = 24.sp)
                    }
                }
            }
        }
        Text(message, Modifier.padding(vertical = 8.dp), color = Ink, fontSize = 12.sp)
        if (phase == "play" || phase == "roundComplete" || phase == "matchComplete") {
            Text("YOUR HAND", color = DeepBlue, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Row(Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                hands[0].forEach { card ->
                    Text(cardLabel(card), Modifier.background(Color.White, RoundedCornerShape(6.dp)).clickable { playUserCard(card) }.padding(horizontal = 7.dp, vertical = 12.dp),
                        color = if (card.suit == 1 || card.suit == 2) Color.Red else Ink, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
        if (phase == "roundComplete") {
            Button(onClick = { startNextHand() }, modifier = Modifier.fillMaxWidth()) { Text("Next hand") }
        }
        if (phase == "matchComplete") {
            Button(onClick = {
                blueScore = 0; redScore = 0; blueBags = 0; redBags = 0; handNumber = 0
                startNextHand()
            }, modifier = Modifier.fillMaxWidth()) { Text("New match") }
        }
    }
}

@Composable
private fun ScoreBox(title: String, blue: Int, blueBags: Int, red: Int, redBags: Int) {
    Column(Modifier.width(118.dp).background(Color.White, RoundedCornerShape(8.dp)).padding(4.dp)) {
        Text(title, Modifier.fillMaxWidth(), color = DeepBlue, textAlign = TextAlign.Center, fontSize = 9.sp, fontWeight = FontWeight.Bold)
        Row {
            Text("$blue", Modifier.weight(1f).background(Color(0xFFD9E9FF)).padding(8.dp), color = DeepBlue, textAlign = TextAlign.Center)
            Text("$blueBags", Modifier.weight(1f).background(Color(0xFFD9E9FF)).padding(8.dp), color = DeepBlue, textAlign = TextAlign.Center)
        }
        Row {
            Text("$red", Modifier.weight(1f).background(Color(0xFFFFE0E0)).padding(8.dp), color = Color.Red, textAlign = TextAlign.Center)
            Text("$redBags", Modifier.weight(1f).background(Color(0xFFFFE0E0)).padding(8.dp), color = Color.Red, textAlign = TextAlign.Center)
        }
    }
}

@Composable
private fun SettingsScreen(drawThree: Boolean, onDrawThree: (Boolean) -> Unit, onBack: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(18.dp)) {
        GameHeader("Settings", onBack)
        Text("Solitaire deal", color = Ink, fontWeight = FontWeight.Bold)
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = !drawThree, onClick = { onDrawThree(false) })
            Text("Draw 1")
            Spacer(Modifier.width(20.dp))
            RadioButton(selected = drawThree, onClick = { onDrawThree(true) })
            Text("Draw 3")
        }
        Text("Your choice is saved on this device.", color = Color.Gray, fontSize = 12.sp)
    }
}
