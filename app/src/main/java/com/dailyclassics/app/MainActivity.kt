package com.dailyclassics.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
    val puzzle = "530070000600195000098000060800060003400803001700020006060000280000419005000080079"
    val solution = "534678912672195348198342567859761423426853791713924856961537284287419635345286179"
    val cells = remember { mutableStateListOf<Char>().apply {
        val saved = prefs.getString("sudoku", null)
        (saved ?: puzzle).forEach { add(it) }
    } }
    var selected by remember { mutableIntStateOf(0) }
    var notesMode by remember { mutableStateOf(false) }
    var noteText by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("Fill each row, column and 3×3 box with 1–9.") }
    val notes = remember { mutableStateMapOf<Int, String>() }
    Column(Modifier.fillMaxSize().padding(14.dp)) {
        GameHeader("Daily Sudoku", onBack, "Today's puzzle")
        Text(message, color = Ink, fontSize = 12.sp)
        Spacer(Modifier.height(10.dp))
        Column(Modifier.fillMaxWidth().aspectRatio(1f).background(DeepBlue).padding(2.dp)) {
            for (r in 0..8) {
                Row(Modifier.weight(1f)) {
                    for (c in 0..8) {
                        val i = r * 9 + c
                        val fixed = puzzle[i] != '0'
                        val chosen = selected == i
                        Box(
                            Modifier.weight(1f).fillMaxHeight()
                                .padding(0.5.dp)
                                .background(if (chosen) Color(0xFFB8D9FF) else Color.White)
                                .clickable { selected = i },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                if (cells[i] != '0') cells[i].toString() else notes[i].orEmpty(),
                                color = if (fixed) DeepBlue else Ink,
                                fontSize = if (notes[i] != null && cells[i] == '0') 8.sp else 18.sp,
                                fontWeight = if (fixed) FontWeight.Bold else FontWeight.Normal
                            )
                        }
                    }
                }
            }
        }
        Spacer(Modifier.height(12.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = { notesMode = !notesMode }, colors = ButtonDefaults.buttonColors(containerColor = if (notesMode) Green else Blue), modifier = Modifier.weight(1f)) { Text(if (notesMode) "Notes ON" else "Notes OFF") }
            OutlinedButton(onClick = { cells.indices.forEach { if (puzzle[it] == '0') { cells[it] = '0'; notes.remove(it) } }; prefs.edit().remove("sudoku").apply() }, modifier = Modifier.weight(1f)) { Text("Clear") }
            OutlinedButton(onClick = { message = if (cells.joinToString("") == solution) "Excellent! Puzzle solved." else "Keep going — check your rows, columns and boxes." }, modifier = Modifier.weight(1f)) { Text("Check") }
        }
        Spacer(Modifier.height(8.dp))
        for (row in 0..2) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                for (col in 1..3) {
                    val n = row * 3 + col
                    Button(onClick = {
                        if (puzzle[selected] == '0') {
                            if (notesMode) notes[selected] = (notes[selected].orEmpty() + n.toString()).filter { it != n.toString() } + n.toString()
                            else { cells[selected] = ('0'.code + n).toChar(); notes.remove(selected); prefs.edit().putString("sudoku", cells.joinToString("")).apply() }
                        }
                    }, modifier = Modifier.weight(1f), contentPadding = PaddingValues(4.dp)) { Text(n.toString(), fontSize = 19.sp) }
                }
            }
        }
        Text("Selected square: row ${selected / 9 + 1}, column ${selected % 9 + 1}", color = Color.Gray, fontSize = 11.sp, modifier = Modifier.padding(top = 8.dp))
    }
}

@Composable
private fun CrosswordScreen(onBack: () -> Unit, prefs: android.content.SharedPreferences) {
    val rows = listOf("CAT....", "A......", "R......", "......", ".......", ".......", ".......")
    val entries = remember { mutableStateListOf<Char>().apply {
        val saved = prefs.getString("crossword", null) ?: ".".repeat(49)
        saved.forEach { add(it) }
    } }
    var selected by remember { mutableIntStateOf(0) }
    var activeClue by remember { mutableStateOf("1 Across — A pet that says meow (3)") }
    val clues = listOf("1 Across — A pet that says meow (3)", "2 Across — Opposite of yes (2)", "3 Across — A red fruit (5)", "4 Down — Frozen water (3)", "5 Down — The sun gives this (5)")
    Column(Modifier.fillMaxSize().padding(14.dp)) {
        GameHeader("Daily Crossword", onBack, "Sample mini crossword")
        Card(colors = CardDefaults.cardColors(containerColor = Color.White)) {
            Text(activeClue, Modifier.fillMaxWidth().padding(14.dp), color = Ink, fontWeight = FontWeight.Bold)
        }
        Spacer(Modifier.height(10.dp))
        Column(Modifier.fillMaxWidth().aspectRatio(1f).background(DeepBlue).padding(2.dp)) {
            for (r in 0..6) Row(Modifier.weight(1f)) {
                for (c in 0..6) {
                    val i = r * 7 + c
                    val black = (r == 0 && c > 2) || (r == 1 && c > 0) || (r == 2 && c > 0) || (r > 2 && (r + c) % 4 == 0)
                    Box(Modifier.weight(1f).fillMaxHeight().padding(1.dp).background(if (black) DeepBlue else if (selected == i) Color(0xFFB8D9FF) else Color.White).clickable { if (!black) selected = i }, contentAlignment = Alignment.Center) {
                        if (!black) Text(entries[i].takeIf { it != '.' }?.toString() ?: "", color = Ink, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
        Spacer(Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedButton(onClick = { activeClue = clues[0]; selected = 0 }, modifier = Modifier.weight(1f)) { Text("Across") }
            OutlinedButton(onClick = { activeClue = clues[3]; selected = 3 }, modifier = Modifier.weight(1f)) { Text("Down") }
        }
        Text("CLUES — tap one to jump to its answer", color = DeepBlue, fontWeight = FontWeight.Bold, modifier = Modifier.padding(vertical = 8.dp))
        LazyColumn(Modifier.weight(1f)) {
            items(clues) { clue -> Text(clue, Modifier.fillMaxWidth().clickable { activeClue = clue; selected = when (clue) { clues[0] -> 0; clues[1] -> 7; clues[2] -> 14; clues[3] -> 3; else -> 4 } }.background(if (clue == activeClue) Color(0xFFD8E9FF) else Color.Transparent).padding(10.dp), color = Ink) }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalAlignment = Alignment.CenterVertically) {
            ('A'..'Z').chunked(13).forEach { letters ->
                Row(Modifier.weight(1f), horizontalArrangement = Arrangement.spacedBy(3.dp)) {
                    letters.take(7).forEach { letter ->
                        Text(letter.toString(), Modifier.weight(1f).background(Color.White, RoundedCornerShape(5.dp)).clickable {
                            entries[selected] = letter
                            prefs.edit().putString("crossword", entries.joinToString("")).apply()
                            selected = (selected + 1).coerceAtMost(48)
                        }.padding(vertical = 8.dp), textAlign = TextAlign.Center, color = DeepBlue, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

private data class PlayingCard(val rank: Int, val suit: Int, val faceUp: Boolean = true) {
    val symbol get() = listOf("♣", "♦", "♥", "♠")[suit]
    val label get() = listOf("","A","2","3","4","5","6","7","8","9","10","J","Q","K")[rank] + symbol
    val red get() = suit == 1 || suit == 2
}

@Composable
private fun SolitaireScreen(onBack: () -> Unit, drawThree: Boolean) {
    val deck = remember { mutableStateListOf<PlayingCard>().apply { addAll((0..3).flatMap { s -> (1..13).map { r -> PlayingCard(r,s) } }.shuffled()) } }
    val stock = remember { mutableStateListOf<PlayingCard>().apply { addAll(deck.drop(28)) } }
    val waste = remember { mutableStateListOf<PlayingCard>() }
    val columns = remember { mutableStateListOf<MutableList<PlayingCard>>().apply {
        var k = 0
        for (i in 1..7) { add(deck.subList(k, k+i).mapIndexed { idx, card -> card.copy(faceUp = idx == i-1) }.toMutableList()); k += i }
    } }
    val foundations = remember { mutableStateListOf<Int>().apply { repeat(4) { add(0) } } }
    var moves by remember { mutableIntStateOf(0) }
    var message by remember { mutableStateOf("Tap stock to deal. Tap a column's top card to select it, then another column.") }
    var selectedCol by remember { mutableIntStateOf(-1) }
    Column(Modifier.fillMaxSize().background(Felt).padding(12.dp)) {
        GameHeader("Klondike Solitaire", onBack, "Score: ${foundations.sum() * 10}   Moves: $moves")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Card(colors = CardDefaults.cardColors(containerColor = Color(0xFF0E4B37)), modifier = Modifier.clickable {
                if (stock.isNotEmpty()) repeat(if (drawThree) 3 else 1) { if (stock.isNotEmpty()) waste.add(stock.removeAt(stock.lastIndex)) }
                else { stock.addAll(waste.reversed()); waste.clear() }
                moves++
            }) { Text(if (stock.isEmpty()) "↻" else "▧", Modifier.padding(18.dp), color = Color.White, fontSize = 22.sp) }
            Text(waste.lastOrNull()?.label ?: "Waste", Modifier.background(Color.White, RoundedCornerShape(8.dp)).padding(16.dp), color = Ink)
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                foundations.forEachIndexed { i, count -> Text(if (count == 0) listOf("♣","♦","♥","♠")[i] else "$count", Modifier.background(Color(0xFF0E4B37), RoundedCornerShape(8.dp)).padding(12.dp), color = Color.White) }
            }
        }
        Text(message, color = Color.White, fontSize = 11.sp, modifier = Modifier.padding(vertical = 10.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            columns.forEachIndexed { index, pile ->
                Column(Modifier.weight(1f).clickable {
                    if (selectedCol == index) selectedCol = -1
                    else if (selectedCol >= 0) {
                        val from = columns[selectedCol]
                        val to = columns[index]
                        val card = from.lastOrNull()
                        val target = to.lastOrNull()
                        if (card != null && card.faceUp && (target == null && card.rank == 13 || target != null && target.rank == card.rank + 1 && target.red != card.red)) {
                            to.add(card); from.removeAt(from.lastIndex)
                            if (from.isNotEmpty() && !from.last().faceUp) from[from.lastIndex] = from.last().copy(faceUp = true)
                            moves++; message = "Nice move."
                        } else message = "That card cannot go there."
                        selectedCol = -1
                    } else selectedCol = index
                }, verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    if (pile.isEmpty()) Text("K", Modifier.fillMaxWidth().background(Color(0xFF1C8058), RoundedCornerShape(5.dp)).padding(vertical = 12.dp), color = Color.White, textAlign = TextAlign.Center, fontSize = 10.sp)
                    pile.forEachIndexed { j, card ->
                        Text(if (card.faceUp) card.label else "▧", Modifier.fillMaxWidth().background(if (selectedCol == index && j == pile.lastIndex) Color(0xFFFFE39B) else Color.White, RoundedCornerShape(5.dp)).padding(vertical = 8.dp), color = if (card.red) Color.Red else Ink, textAlign = TextAlign.Center, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
        Spacer(Modifier.weight(1f))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = { selectedCol = -1; message = "Select a column, then its destination." }, modifier = Modifier.weight(1f)) { Text("Undo / Reset") }
            Button(onClick = { message = "Move valid descending alternating-color sequences to build foundations A–K." }, modifier = Modifier.weight(1f)) { Text("Hint") }
        }
    }
}

@Composable
private fun SpadesScreen(onBack: () -> Unit) {
    val suits = listOf("♣", "♦", "♥", "♠")
    val names = listOf("You", "Huey", "Dewey", "Louie")
    val hands = remember { mutableStateListOf<MutableList<PlayingCard>>().apply {
        val cards = (0..3).flatMap { s -> (2..14).map { r -> PlayingCard(r,s) } }.shuffled()
        repeat(4) { add(cards.drop(it*13).toMutableList().sortedWith(compareBy<PlayingCard> { it.suit }.thenBy { it.rank }).toMutableList()) }
    } }
    val trick = remember { mutableStateListOf<Pair<Int, PlayingCard>>() }
    var turn by remember { mutableIntStateOf(0) }
    var leadSuit by remember { mutableIntStateOf(-1) }
    var blueScore by remember { mutableIntStateOf(0) }
    var redScore by remember { mutableIntStateOf(0) }
    var blueBags by remember { mutableIntStateOf(0) }
    var redBags by remember { mutableIntStateOf(0) }
    var message by remember { mutableStateOf("You and Dewey are blue. Huey and Louie are red. Play a card.") }
    fun playCard(player: Int, card: PlayingCard) {
        if (player == 0 && turn == 0) {
            hands[0].remove(card)
            trick.add(player to card)
            if (leadSuit < 0) leadSuit = card.suit
            turn = 1
        }
    }
    Column(Modifier.fillMaxSize().background(Color(0xFFE9F2FC)).padding(12.dp)) {
        GameHeader("Partnership Spades", onBack, "You + Dewey (Blue)  •  Huey + Louie (Red)")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            ScoreBox("SCORE", blueScore, blueBags, redScore, redBags)
            Column(horizontalAlignment = Alignment.End) {
                Text("Huey  •  Red", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold)
                Text("Dewey  •  Blue", color = DeepBlue, fontWeight = FontWeight.Bold)
                Text("Louie  •  Red", color = Color(0xFFB52E38), fontWeight = FontWeight.Bold)
            }
        }
        Spacer(Modifier.height(22.dp))
        Box(Modifier.fillMaxWidth().weight(1f).background(Color(0xFF277B55), RoundedCornerShape(22.dp)), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Dewey", color = Color.White, fontWeight = FontWeight.Bold)
                Text(trick.firstOrNull { it.first == 2 }?.second?.label ?: "🂠", color = Color.White, fontSize = 25.sp)
                Spacer(Modifier.height(12.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(18.dp)) {
                    Text(trick.firstOrNull { it.first == 1 }?.second?.label ?: "🂠", color = Color.White, fontSize = 24.sp)
                    Text(trick.firstOrNull { it.first == 3 }?.second?.label ?: "🂠", color = Color.White, fontSize = 24.sp)
                }
                Spacer(Modifier.height(12.dp))
                Text(trick.firstOrNull { it.first == 0 }?.second?.label ?: "Your play", color = Color.White, fontSize = 23.sp)
            }
        }
        Text(message, Modifier.padding(vertical = 8.dp), color = Ink, fontSize = 12.sp)
        Text("YOUR HAND", color = DeepBlue, fontWeight = FontWeight.Bold)
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(3.dp)) {
            hands[0].forEach { card ->
                Text(card.label, Modifier.weight(1f).background(Color.White, RoundedCornerShape(5.dp)).clickable {
                    if (turn == 0 && (leadSuit < 0 || card.suit == leadSuit || hands[0].none { it.suit == leadSuit })) {
                        playCard(0, card)
                        message = "You played ${card.label}. The bots are taking their turns."
                        // Lightweight automated replies; same legal-follow-suit rule for each bot.
                        for (p in 1..3) {
                            val candidates = hands[p].filter { leadSuit < 0 || it.suit == leadSuit }
                            val chosen = (candidates.ifEmpty { hands[p] }).minByOrNull { it.rank } ?: continue
                            hands[p].remove(chosen); trick.add(p to chosen)
                        }
                        val winner = trick.maxWithOrNull(compareBy<Pair<Int,PlayingCard>> { if (it.second.suit == leadSuit) 1 else 0 }.thenBy { if (it.second.suit == 3) it.second.rank + 20 else it.second.rank })?.first ?: 0
                        if (winner == 0 || winner == 2) blueScore += 1 else redScore += 1
                        message = "${names[winner]} wins the trick. Tap a card to lead the next trick."
                        trick.clear(); leadSuit = -1; turn = 0
                    } else message = "Follow suit when possible."
                }.padding(vertical = 10.dp), color = if (card.red) Color.Red else Ink, fontSize = 9.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
            }
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
