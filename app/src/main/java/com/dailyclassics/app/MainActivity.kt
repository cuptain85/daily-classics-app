package com.dailyclassics.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.zIndex
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random
import java.time.LocalDate
import java.time.YearMonth

private val Blue = Color(0xFF1769D2)
private val DeepBlue = Color(0xFF104A9B)
private val Green = Color(0xFF35B66A)
private val Pale = Color(0xFFEAF3FF)
private val Ink = Color(0xFF17324D)
private val Felt = Color(0xFF176B49)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val prefs = getSharedPreferences("daily_classics", MODE_PRIVATE)
        setContent {
            MaterialTheme {
                var page by remember { mutableStateOf("Home") }
                var selectedGame by remember { mutableStateOf("Sudoku") }
                var selectedDate by remember { mutableStateOf(LocalDate.now()) }
                var drawThree by remember { mutableStateOf(prefs.getBoolean("draw3", false)) }
                Surface(Modifier.fillMaxSize().safeDrawingPadding(), color = Pale) {
                    when (page) {
                        "Home" -> Home(onGame = { selectedGame = it; page = if (it == "Sudoku" || it == "Crossword") "Calendar" else it })
                        "Calendar" -> GameCalendarScreen(game = selectedGame, onBack = { page = "Home" }, onDateSelected = { selectedDate = it; page = selectedGame })
                        "Sudoku" -> SudokuScreen(onBack = { page = "Home" }, prefs = prefs, initialDate = selectedDate)
                        "Crossword" -> CrosswordScreen(onBack = { page = "Home" }, prefs = prefs, initialDate = selectedDate)
                        "Spades" -> SpadesScreen(onBack = { page = "Home" })
                        "Solitaire" -> SolitaireScreen(
                            onBack = { page = "Home" },
                            drawThree = drawThree,
                            onDrawThree = {
                                drawThree = it
                                prefs.edit().putBoolean("draw3", it).apply()
                            },
                            prefs = prefs
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun GameCalendarScreen(
    game: String,
    onBack: () -> Unit,
    onDateSelected: (LocalDate) -> Unit
) {
    var month by remember { mutableStateOf(YearMonth.now()) }
    val today = LocalDate.now()
    val firstOffset = month.atDay(1).dayOfWeek.value % 7
    val days = month.lengthOfMonth()
    Column(
        Modifier.fillMaxSize().background(
            Brush.verticalGradient(listOf(Color(0xFF19AEEF), Color(0xFFB8EEFF), Color(0xFFB6ED75)))
        ).padding(16.dp)
    ) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text("‹", Modifier.clickable { onBack() }.padding(end = 16.dp), color = DeepBlue, fontSize = 36.sp)
            Column {
                Text(game, color = DeepBlue, fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
                Text("Choose a day to play", color = Ink, fontSize = 14.sp)
            }
        }
        Spacer(Modifier.height(18.dp))
        Card(Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(22.dp)) {
            Column(Modifier.padding(14.dp)) {
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("‹", Modifier.clickable { month = month.minusMonths(1) }.padding(10.dp), color = DeepBlue, fontSize = 30.sp)
                    Text(month.month.name.lowercase().replaceFirstChar { it.uppercase() } + " " + month.year, color = DeepBlue, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Text("›", Modifier.clickable { month = month.plusMonths(1) }.padding(10.dp), color = if (month < YearMonth.from(today).plusMonths(1)) DeepBlue else Color.LightGray, fontSize = 30.sp)
                }
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    listOf("S", "M", "T", "W", "T", "F", "S").forEach {
                        Text(it, Modifier.weight(1f), color = Color.Gray, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
                    }
                }
                repeat(6) { week ->
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        repeat(7) { weekday ->
                            val day = week * 7 + weekday - firstOffset + 1
                            val valid = day in 1..days
                            val date = if (valid) month.atDay(day) else null
                            val available = date != null && !date.isAfter(today)
                            Box(
                                Modifier.weight(1f).aspectRatio(1f)
                                    .padding(2.dp)
                                    .background(
                                        when {
                                            date == today -> Color(0xFF1769D2)
                                            available -> Color(0xFFE4F4DC)
                                            else -> Color(0xFFF3F5F7)
                                        },
                                        RoundedCornerShape(10.dp)
                                    )
                                    .then(if (available) Modifier.clickable { onDateSelected(date!!) } else Modifier),
                                contentAlignment = Alignment.Center
                            ) {
                                if (valid) Text(
                                    day.toString(),
                                    color = when {
                                        date == today -> Color.White
                                        available -> Color(0xFF24652D)
                                        else -> Color.LightGray
                                    },
                                    fontWeight = if (date == today) FontWeight.ExtraBold else FontWeight.Medium
                                )
                            }
                        }
                    }
                }
                Spacer(Modifier.height(8.dp))
                Text("Select any date up to today. Future dates aren't available yet.", color = Color.Gray, fontSize = 11.sp)
            }
        }
    }
}

@Composable
private fun Home(onGame: (String) -> Unit) {
    Column(
        Modifier.fillMaxSize().background(
            Brush.verticalGradient(
                listOf(Color(0xFF0876D5), Color(0xFF55C9F5), Color(0xFFBDEEFF), Color(0xFFB9E878), Color(0xFF58B844))
            )
        ).padding(horizontal = 12.dp, vertical = 10.dp)
    ) {
        Column(
            Modifier.fillMaxWidth().weight(0.19f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "Daily Classics",
                color = Color(0xFFFFF8E8),
                fontSize = 39.sp,
                fontWeight = FontWeight.Black,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
                letterSpacing = (-1.2).sp,
                style = androidx.compose.ui.text.TextStyle(
                    shadow = androidx.compose.ui.graphics.Shadow(
                        Color(0xFF063A78),
                        androidx.compose.ui.geometry.Offset(2f, 4f),
                        7f
                    )
                )
            )
            Text(
                "Play  •  Puzzle  •  Relax",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
                style = androidx.compose.ui.text.TextStyle(
                    shadow = androidx.compose.ui.graphics.Shadow(
                        Color(0xFF174E84),
                        androidx.compose.ui.geometry.Offset(1f, 2f),
                        4f
                    )
                )
            )
        }

        Column(
            Modifier.fillMaxWidth().weight(0.69f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(Modifier.weight(1f), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                GameTile("Sudoku", Color(0xFF0875E1), onClick = { onGame("Sudoku") }, modifier = Modifier.weight(1f)) {
                    SudokuTileArt()
                }
                GameTile("Crossword", Color(0xFF258F38), onClick = { onGame("Crossword") }, modifier = Modifier.weight(1f)) {
                    CrosswordTileArt()
                }
            }
            Row(Modifier.weight(1f), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                GameTile("Spades", Color(0xFF7624C8), onClick = { onGame("Spades") }, modifier = Modifier.weight(1f)) {
                    DecorativeCards(listOf("J", "Q", "K", "A"), "♠", false)
                }
                GameTile("Solitaire", Color(0xFF399B35), onClick = { onGame("Solitaire") }, modifier = Modifier.weight(1f)) {
                    DecorativeCards(listOf("A", "2", "3", "4", "5"), "♥", true)
                }
            }
        }

        Row(
            Modifier.fillMaxWidth().weight(0.12f).padding(top = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("🦆", fontSize = 43.sp)
            Text("🌼   🌸   🌼", fontSize = 22.sp)
            Text("🐰", fontSize = 43.sp)
        }
    }
}

@Composable
private fun GameTile(
    title: String,
    accent: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    art: @Composable () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = modifier.fillMaxHeight(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF9ED)),
        elevation = CardDefaults.cardElevation(defaultElevation = 9.dp)
    ) {
        Column(
            Modifier.fillMaxSize()
                .border(3.dp, Color.White, RoundedCornerShape(24.dp))
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                title,
                color = Color(0xFF102F5E),
                fontSize = if (title == "Crossword" || title == "Solitaire") 22.sp else 25.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                maxLines = 1
            )
            Spacer(Modifier.height(5.dp))
            Box(
                Modifier.fillMaxWidth().weight(1f)
                    .background(
                        Brush.verticalGradient(listOf(accent.copy(alpha = 0.16f), accent.copy(alpha = 0.07f))),
                        RoundedCornerShape(15.dp)
                    )
                    .border(1.5.dp, accent.copy(alpha = 0.45f), RoundedCornerShape(15.dp))
                    .padding(5.dp),
                contentAlignment = Alignment.Center
            ) {
                art()
            }
        }
    }
}

@Composable
private fun SudokuTileArt() {
    val digits = listOf(
        listOf("5", "3", "", "7"),
        listOf("6", "", "1", "9"),
        listOf("", "9", "8", ""),
        listOf("8", "", "", "6")
    )
    Column(
        Modifier.fillMaxHeight(0.94f).aspectRatio(0.92f)
            .background(Color.White, RoundedCornerShape(7.dp))
            .border(2.dp, Color(0xFF1D6FC4), RoundedCornerShape(7.dp))
            .padding(3.dp)
    ) {
        digits.forEachIndexed { r, row ->
            Row(Modifier.weight(1f)) {
                row.forEachIndexed { col, value ->
                    Box(
                        Modifier.weight(1f).fillMaxHeight()
                            .border(
                                width = if ((col + 1) % 2 == 0 || (r + 1) % 2 == 0) 1.dp else 0.5.dp,
                                color = Color(0xFF8BA9C8)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(value, color = Color(0xFF123A70), fontSize = 19.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

@Composable
private fun CrosswordTileArt() {
    val pattern = listOf(
        listOf(1, 0, 0, 1, 0),
        listOf(0, 0, 1, 0, 0),
        listOf(1, 0, 0, 0, 1),
        listOf(0, 1, 0, 0, 0),
        listOf(0, 0, 1, 0, 1)
    )
    Column(
        Modifier.fillMaxHeight(0.94f).aspectRatio(0.92f)
            .background(Color(0xFF17202B), RoundedCornerShape(6.dp))
            .border(2.dp, Color(0xFF4C9AC4), RoundedCornerShape(6.dp))
            .padding(3.dp)
    ) {
        pattern.forEach { row ->
            Row(Modifier.weight(1f)) {
                row.forEach { open ->
                    Box(
                        Modifier.weight(1f).fillMaxHeight()
                            .padding(0.7.dp)
                            .background(if (open == 1) Color(0xFF20252B) else Color(0xFFFFFEFA))
                    )
                }
            }
        }
    }
}

@Composable
private fun DecorativeCards(ranks: List<String>, suit: String, red: Boolean) {
    Box(Modifier.fillMaxWidth().fillMaxHeight(0.92f), contentAlignment = Alignment.Center) {
        ranks.forEachIndexed { index, rank ->
            val color = if (red) Color(0xFFD82037) else Color(0xFF111820)
            Column(
                Modifier.offset(
                    x = ((index - (ranks.size - 1) / 2f) * 25).dp,
                    y = (if (index % 2 == 0) 5 else (-5)).dp
                )
                    .zIndex(index.toFloat())
                    .width(if (ranks.size == 5) 52.dp else 58.dp)
                    .fillMaxHeight(0.82f)
                    .background(Color(0xFFFFFEFA), RoundedCornerShape(8.dp))
                    .border(1.dp, Color(0xFFB6B6B6), RoundedCornerShape(8.dp))
                    .padding(4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(rank, color = color, fontSize = 18.sp, fontWeight = FontWeight.Black)
                Text(suit, color = color, fontSize = 27.sp, fontWeight = FontWeight.Black)
                Spacer(Modifier.weight(1f))
                Text(suit, color = color, fontSize = 24.sp)
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
private fun SudokuScreen(onBack: () -> Unit, prefs: android.content.SharedPreferences, initialDate: LocalDate) {
    var date by remember { mutableStateOf(initialDate) }
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

    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(14.dp)) {
        GameHeader("Daily Sudoku", onBack, "Puzzle for ${daily.dateKey}")
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            OutlinedButton(onClick = { date = date.minusDays(1) }, contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)) { Text("‹ Previous") }
            Text(if (date == LocalDate.now()) "Today" else date.toString(), color = DeepBlue, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            OutlinedButton(onClick = { date = date.plusDays(1) }, contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)) { Text("Next ›") }
        }
        Text(message, color = Ink, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        Column(
            Modifier.fillMaxWidth().aspectRatio(1f).background(DeepBlue).padding(2.dp)
                .drawWithContent {
                    drawContent()
                    val line = 3.dp.toPx()
                    for (i in 1..2) {
                        val x = size.width * i / 3f
                        val y = size.height * i / 3f
                        drawLine(DeepBlue, androidx.compose.ui.geometry.Offset(x, 0f), androidx.compose.ui.geometry.Offset(x, size.height), line)
                        drawLine(DeepBlue, androidx.compose.ui.geometry.Offset(0f, y), androidx.compose.ui.geometry.Offset(size.width, y), line)
                    }
                }
        ) {
            for (r in 0..8) {
                Row(Modifier.weight(1f)) {
                    for (c in 0..8) {
                        val i = r * 9 + c
                        val fixed = puzzle[i] != '0'
                        val chosen = selected == i
                        val selectedValue = cells[selected]
                        val sameNumber = selectedValue != '0' && cells[i] == selectedValue
                        val sameRowOrColumn = r == selected / 9 || c == selected % 9
                        val conflict = cells[i] != '0' && cells.indices.any { other ->
                            other != i && cells[other] == cells[i] &&
                                (other / 9 == i / 9 || other % 9 == i % 9 ||
                                    (other / 27 == i / 27 && other % 9 / 3 == i % 9 / 3))
                        }
                        Box(
                            Modifier.weight(1f).fillMaxHeight().padding(0.5.dp)
                                .background(
                                    when {
                                        chosen -> Color(0xFFB8D9FF)
                                        conflict -> Color(0xFFFFDADA)
                                        sameNumber -> Color(0xFFFFE8A3)
                                        sameRowOrColumn -> Color(0xFFEAF3FF)
                                        else -> Color.White
                                    }
                                )
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
            Row(Modifier.fillMaxWidth().height(44.dp), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
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
                    }, modifier = Modifier.weight(1f).fillMaxHeight(), contentPadding = PaddingValues(0.dp)) { Text(n.toString(), fontSize = 19.sp) }
                }
            }
        }
        Text("Selected square: row ${selected / 9 + 1}, column ${selected % 9 + 1}", color = Color.Gray, fontSize = 11.sp, modifier = Modifier.padding(top = 6.dp))
    }
}

@Composable
private fun CrosswordScreen(onBack: () -> Unit, prefs: android.content.SharedPreferences, initialDate: LocalDate) {
    var date by remember { mutableStateOf(initialDate) }
    val puzzle = remember(date) { CrosswordPuzzleGenerator.forDate(date.toString()) }
    val entries = puzzle.entries
    val blocked = remember(puzzle) { puzzle.blankGrid.map { it == '#' } }
    val savedKey = "crossword_" + date.toString()
    val cells = remember(puzzle) {
        mutableStateListOf<Char>().apply {
            val saved = prefs.getString(savedKey, null)
            (saved?.takeIf { it.length == 169 } ?: puzzle.blankGrid).forEach { add(it) }
        }
    }
    var activeIndex by remember(puzzle) { mutableIntStateOf(0) }
    var selectedCell by remember(puzzle) { mutableIntStateOf(entries.first().cells.first()) }
    var lastTappedCell by remember(puzzle) { mutableIntStateOf(-1) }
    var message by remember(puzzle) { mutableStateOf("") }
    var keyboardText by remember { mutableStateOf("") }
    val focusRequester = remember { androidx.compose.ui.focus.FocusRequester() }
    val keyboard = androidx.compose.ui.platform.LocalSoftwareKeyboardController.current
    val clueListState = rememberLazyListState()
    val active = entries[activeIndex]
    val completed = entries.count { entry -> entry.cells.all { cells[it] == puzzle.solutionGrid[it] } }
    val cellNumbers = remember(puzzle) { entries.groupBy { it.cells.first() }.mapValues { (_, atCell) -> atCell.minOf { entry -> entry.number } } }

    LaunchedEffect(activeIndex) { clueListState.animateScrollToItem(activeIndex) }
    fun save() { prefs.edit().putString(savedKey, cells.joinToString("")).apply() }
    fun enterLetter(letter: Char) {
        if (blocked[selectedCell] || !letter.isLetter()) return
        cells[selectedCell] = letter.uppercaseChar()
        save()
        val position = active.cells.indexOf(selectedCell)
        if (position >= 0 && position < active.cells.lastIndex) selectedCell = active.cells[position + 1]
    }
    fun selectCell(cell: Int) {
        if (blocked[cell]) return
        val options = entries.indices.filter { cell in entries[it].cells }
        if (options.isEmpty()) return
        val sameCellAgain = lastTappedCell == cell
        val current = options.indexOf(activeIndex)
        val next = if (sameCellAgain && options.size > 1) options[(current + 1).mod(options.size)]
            else options.firstOrNull { entries[it].across == active.across } ?: options.first()
        activeIndex = next
        selectedCell = cell
        lastTappedCell = cell
        keyboardText = ""
        focusRequester.requestFocus()
        keyboard?.show()
    }

    Column(Modifier.fillMaxSize().background(Color.White).padding(horizontal = 10.dp, vertical = 6.dp)) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text("‹", Modifier.clickable { onBack() }.padding(end = 12.dp), color = Color.Black, fontSize = 30.sp)
            Column(Modifier.weight(1f)) {
                Text("CROSSWORD", color = Color.Black, fontSize = 21.sp, fontWeight = FontWeight.Bold, letterSpacing = 2.sp)
                Text(date.toString(), color = Color.DarkGray, fontSize = 11.sp)
            }
            Text("${completed}/${entries.size}", color = Color.Black, fontSize = 12.sp)
        }
        Row(Modifier.fillMaxWidth().padding(vertical = 3.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            TextButton(onClick = { date = date.minusDays(1) }) { Text("‹ Previous", color = Color.Black) }
            TextButton(onClick = { date = date.plusDays(1) }) { Text("Next ›", color = Color.Black) }
        }
        Box(Modifier.fillMaxWidth().aspectRatio(1f).background(Color.Black).padding(1.dp)) {
            Column(Modifier.fillMaxSize()) {
                for (row in 0 until 13) {
                    Row(Modifier.weight(1f)) {
                        for (col in 0 until 13) {
                            val cell = row * 13 + col
                            val isBlock = blocked[cell]
                            Box(
                                Modifier.weight(1f).fillMaxHeight().padding(0.35.dp)
                                    .background(if (isBlock) Color.Black else if (cell == selectedCell) Color(0xFFE8E8E8) else Color.White)
                                    .clickable(enabled = !isBlock) { selectCell(cell) },
                                contentAlignment = Alignment.Center
                            ) {
                                if (!isBlock) {
                                    val letter = cells[cell].takeIf { it != '.' && it != '#' }?.toString() ?: ""
                                    Text(letter, color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Medium)
                                    cellNumbers[cell]?.let { number ->
                                        Text(number.toString(), Modifier.align(Alignment.TopStart).padding(start = 1.dp),
                                            color = Color.Black, fontSize = 6.sp, lineHeight = 7.sp)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Text("CLUES", Modifier.padding(top = 7.dp, bottom = 3.dp), color = Color.Black, fontSize = 13.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
        LazyColumn(state = clueListState, modifier = Modifier.weight(1f)) {
            item { Text("ACROSS", Modifier.fillMaxWidth().background(Color(0xFFEDEDED)).padding(6.dp), color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Bold) }
            items(entries.filter { it.across }) { entry ->
                val index = entries.indexOf(entry)
                Text("${entry.number}.  ${entry.clue}",
                    Modifier.fillMaxWidth().clickable { activeIndex = index; selectedCell = entry.cells.first(); lastTappedCell = -1; focusRequester.requestFocus(); keyboard?.show() }
                        .background(if (index == activeIndex) Color(0xFFF0F0F0) else Color.White).padding(horizontal = 7.dp, vertical = 5.dp),
                    color = Color.Black, fontSize = 12.sp, fontWeight = if (index == activeIndex) FontWeight.Bold else FontWeight.Normal)
            }
            item { Text("DOWN", Modifier.fillMaxWidth().background(Color(0xFFEDEDED)).padding(6.dp), color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Bold) }
            items(entries.filter { !it.across }) { entry ->
                val index = entries.indexOf(entry)
                Text("${entry.number}.  ${entry.clue}",
                    Modifier.fillMaxWidth().clickable { activeIndex = index; selectedCell = entry.cells.first(); lastTappedCell = -1; focusRequester.requestFocus(); keyboard?.show() }
                        .background(if (index == activeIndex) Color(0xFFF0F0F0) else Color.White).padding(horizontal = 7.dp, vertical = 5.dp),
                    color = Color.Black, fontSize = 12.sp, fontWeight = if (index == activeIndex) FontWeight.Bold else FontWeight.Normal)
            }
        }
        BasicTextField(
            value = keyboardText,
            onValueChange = { value ->
                value.lastOrNull { it.isLetter() }?.let { enterLetter(it) }
                keyboardText = ""
            },
            modifier = Modifier.size(1.dp).focusRequester(focusRequester),
            keyboardOptions = androidx.compose.foundation.text.KeyboardOptions(capitalization = androidx.compose.ui.text.input.KeyboardCapitalization.Characters),
            singleLine = true,
            textStyle = androidx.compose.ui.text.TextStyle(color = Color.Transparent)
        )
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Text("Selected: ${active.number} ${if (active.across) "Across" else "Down"}", color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Bold)
            TextButton(onClick = { if (!blocked[selectedCell]) { cells[selectedCell] = '.'; save() } }) { Text("Erase", color = Color.Black) }
            TextButton(onClick = {
                val correct = entries.all { entry -> entry.cells.map { cells[it] }.joinToString("") == entry.answer }
                message = if (correct) "Puzzle complete." else "Keep solving."
            }) { Text("Check", color = Color.Black) }
        }
        if (message.isNotEmpty()) Text(message, color = Color.DarkGray, fontSize = 11.sp)
    }
}

private data class PlayingCard(val rank: Int, val suit: Int, val faceUp: Boolean = true) {
    val symbol get() = listOf("♣", "♦", "♥", "♠")[suit]
    val label get() = (when (rank) { 14 -> "A"; 13 -> "K"; 12 -> "Q"; 11 -> "J"; else -> rank.toString() }) + symbol
    val red get() = suit == 1 || suit == 2
}

@Composable
private fun RealPlayingCard(card: KlondikeCard?, modifier: Modifier = Modifier, faceDown: Boolean = false, selected: Boolean = false, emptySuit: String? = null) {
    val ink = if (card?.isRed == true) Color(0xFFC52232) else Color(0xFF171717)
    Box(modifier.aspectRatio(0.70f)
        .border(if (selected) 2.dp else 1.dp, if (selected) Color(0xFFFFD56A) else Color(0xFF202020), RoundedCornerShape(5.dp))
        .background(if (faceDown) Color(0xFF173B69) else if (card != null) Color(0xFFFFFEFA) else Color(0xFF0D573D), RoundedCornerShape(5.dp))
        .padding(2.dp), contentAlignment = Alignment.Center) {
        if (faceDown) {
            Box(Modifier.fillMaxSize().border(1.dp, Color(0xFFE0D3AD), RoundedCornerShape(3.dp)).padding(2.dp)
                .border(1.dp, Color(0xFF9EB2C9), RoundedCornerShape(2.dp)), contentAlignment = Alignment.Center) {
                Text("✦", color = Color(0xFFE0D3AD), fontSize = 20.sp)
            }
        } else if (card != null) {
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Text(card.label.dropLast(1), color = ink, fontSize = 10.sp, fontWeight = FontWeight.Black, lineHeight = 10.sp)
                    Text(card.label.takeLast(1), color = ink, fontSize = 9.sp, lineHeight = 9.sp)
                }
                Text(card.label.takeLast(1), Modifier.align(Alignment.CenterHorizontally), color = ink, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Column(Modifier.align(Alignment.End), horizontalAlignment = Alignment.End) {
                    Text(card.label.takeLast(1), color = ink, fontSize = 9.sp, lineHeight = 9.sp)
                    Text(card.label.dropLast(1), color = ink, fontSize = 10.sp, fontWeight = FontWeight.Black, lineHeight = 10.sp)
                }
            }
        } else Text(emptySuit ?: "♧", color = Color(0xFFB5D4C3), fontSize = 22.sp)
    }
}

@Composable
private fun SolitaireScreen(
    onBack: () -> Unit,
    drawThree: Boolean,
    onDrawThree: (Boolean) -> Unit,
    prefs: android.content.SharedPreferences
) {
    var game by remember { mutableStateOf(
        KlondikeEngine.deserialize(prefs.getString("solitaire_state", null))
            ?: KlondikeEngine.newGame(System.currentTimeMillis().toInt(), if (drawThree) 3 else 1)
    ) }
    LaunchedEffect(game) { prefs.edit().putString("solitaire_state", KlondikeEngine.serialize(game)).apply() }
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
        Row(
            Modifier.fillMaxWidth().padding(bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Deal:", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.width(8.dp))
            FilterChip(
                selected = !drawThree,
                onClick = { onDrawThree(false) },
                label = { Text("Draw 1") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = Color.White,
                    selectedLabelColor = DeepBlue,
                    labelColor = Color.White
                )
            )
            Spacer(Modifier.width(8.dp))
            FilterChip(
                selected = drawThree,
                onClick = { onDrawThree(true) },
                label = { Text("Draw 3") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = Color.White,
                    selectedLabelColor = DeepBlue,
                    labelColor = Color.White
                )
            )
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("STOCK", color = Color.White, fontSize = 9.sp)
                Box(Modifier.width(48.dp).clickable {
                    history.add(game); redoHistory.clear(); game = KlondikeEngine.deal(game)
                    selectedWaste = false; selectedTableau = null; selectedFoundation = -1
                    message = if (game.stock.isEmpty() && game.waste.isEmpty()) "No cards left to deal." else "Cards dealt."
                }) { RealPlayingCard(null, Modifier.fillMaxWidth(), faceDown = game.stock.isNotEmpty()) }
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("WASTE", color = Color.White, fontSize = 9.sp)
                Box(Modifier.width(48.dp).clickable {
                    if (game.waste.isNotEmpty()) {
                        selectedWaste = true; selectedTableau = null; selectedFoundation = -1
                        message = "Waste card selected. Tap a tableau column or foundation."
                    }
                }) { RealPlayingCard(game.waste.lastOrNull(), Modifier.fillMaxWidth(), selected = selectedWaste) }
            }
            game.foundations.forEachIndexed { suit, pile ->
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("FOUND.", color = Color.White, fontSize = 8.sp)
                    val top = pile.lastOrNull()
                    Box(Modifier.width(43.dp).clickable {
                        if (selectedWaste) commit(KlondikeEngine.moveWasteToFoundation(game))
                        else if (selectedTableau != null && selectedTableau!!.second == game.tableau[selectedTableau!!.first].lastIndex) {
                            commit(KlondikeEngine.moveTableauToFoundation(game, selectedTableau!!.first))
                        } else if (selectedTableau == null) {
                            selectedFoundation = suit; selectedWaste = false
                            message = "Foundation selected. Tap a tableau column to move its top card back."
                        } else message = "Only a tableau top card can move to a foundation."
                    }) { RealPlayingCard(top, Modifier.fillMaxWidth(), selected = selectedFoundation == suit, emptySuit = listOf("♣", "♦", "♥", "♠")[suit]) }
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
                        Box(Modifier.fillMaxWidth().clickable {
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
                        }) { RealPlayingCard(card.takeIf { it.faceUp }, Modifier.fillMaxWidth().height(if (card.faceUp) 54.dp else 18.dp), faceDown = !card.faceUp, selected = selectedTableau == (column to index)) }
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

    Column(Modifier.fillMaxSize().background(Color(0xFF101B18)).padding(10.dp)) {
        GameHeader("Partnership Spades", onBack, "Hand $handNumber  •  You + Dewey vs. Huey + Louie")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            ScoreBox("SCORE", blueScore, blueBags, redScore, redBags)
            Column(horizontalAlignment = Alignment.End) {
                Text("Huey  •  Red  •  Bid ${bids.firstOrNull { it.player == 1 }?.tricks?.let { if (it == 0) "Nil" else it.toString() } ?: "—"}", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold, fontSize = 11.sp)
                Text("Dewey  •  Blue  •  Bid ${bids.firstOrNull { it.player == 2 }?.tricks?.let { if (it == 0) "Nil" else it.toString() } ?: "—"}", color = DeepBlue, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                Text("Louie  •  Red  •  Bid ${bids.firstOrNull { it.player == 3 }?.tricks?.let { if (it == 0) "Nil" else it.toString() } ?: "—"}", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold, fontSize = 11.sp)
            }
        }
        Spacer(Modifier.height(8.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text("Blue tricks: ${tricks[0] + tricks[2]}", color = DeepBlue, fontWeight = FontWeight.Bold)
            Text("Red tricks: ${tricks[1] + tricks[3]}", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold)
        }
        if (phase == "bid") {
            Card(Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color(0xFF20342C)), border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFD6B36A)), shape = RoundedCornerShape(12.dp)) {
                Column(Modifier.padding(10.dp)) {
                    Text("YOUR DEALT HAND  •  13 CARDS", color = Color(0xFFD6B36A), fontWeight = FontWeight.Bold, fontSize = 11.sp)
                    Row(Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()).padding(vertical = 8.dp), horizontalArrangement = Arrangement.spacedBy(3.dp)) {
                        hands[0].forEach { card ->
                            Column(Modifier.width(34.dp).height(53.dp).border(1.dp, Color(0xFFB7B7B7), RoundedCornerShape(4.dp)).background(Color(0xFFFFFEFA), RoundedCornerShape(4.dp)).padding(2.dp),
                                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween) {
                                Text(cardLabel(card), color = if (card.suit == 1 || card.suit == 2) Color(0xFFC52232) else Color(0xFF17211E), fontSize = 9.sp, fontWeight = FontWeight.Bold)
                                Text(listOf("♣", "♦", "♥", "♠")[card.suit], color = if (card.suit == 1 || card.suit == 2) Color(0xFFC52232) else Color(0xFF17211E), fontSize = 15.sp)
                            }
                        }
                    }
                    Text("YOUR BID", color = Color(0xFFD6B36A), fontWeight = FontWeight.Bold)
                    Text("Study your cards. Choose the tricks you expect your team to take.", color = Color(0xFFE0E5E1), fontSize = 11.sp)
                    Row(Modifier.horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                        (0..13).forEach { bid ->
                            Text(if (bid == 0) "Nil" else bid.toString(), Modifier.background(if (selectedBid == bid) Blue else Pale, RoundedCornerShape(8.dp)).clickable { selectedBid = bid }.padding(horizontal = 11.dp, vertical = 10.dp), color = if (selectedBid == bid) Color.White else Ink, fontWeight = FontWeight.Bold)
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

