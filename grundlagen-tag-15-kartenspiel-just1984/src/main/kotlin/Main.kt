// Aufgabe 1 - Kartendeck erstellen
fun erstelleKartendeck(): MutableList<String> {
    val deck = mutableListOf<String>()
    val farben = arrayOf("Schwarz", "Rot")
    val werte = arrayOf("Ass", "2", "3", "4", "5", "6", "7", "8")

    for (farbe in farben) {
        for (wert in werte) {
            deck.add("$farbe $wert")
        }
    }
    return deck
}

// Aufgabe 2 - Kartendeck mischen
fun mischeKartendeck(deck: MutableList<String>): MutableList<String> {
    deck.shuffle()
    return deck
}

// Aufgabe 3 - Karte ziehen
fun zieheKarte(deck: MutableList<String>): String {
    return deck.removeAt(0)
}

// Aufgabe 4 - Eine Hand von Karten ziehen
fun zieheHand(deck: MutableList<String>): MutableList<String> {
    val hand = mutableListOf<String>()
    for (i in 1..5) {
        hand.add(zieheKarte(deck))
    }
    return hand
}

// Aufgabe 5 - Kartendeck Größe
fun kartendeckGroesse(deck: MutableList<String>): Int {
    return deck.size
}

// Aufgabe 7 - Den Karten Punkte zuordnen
fun kartenPunkteZuordnen(deck: MutableList<String>): Map<String, Int> {
    val punkte = mutableMapOf<String, Int>()
    var punktwert = 1
    for (karte in deck) {
        punkte[karte] = punktwert
        punktwert++
    }
    return punkte
}

// Aufgabe 8 - Herausfinden wie viel eine Hand wert ist
fun handWert(hand: MutableList<String>, punkte: Map<String, Int>): Int {
    var summe = 0
    for (karte in hand) {
        summe += punkte[karte] ?: 0
    }
    return summe
}

// Bonus - Karte austauschen
fun karteAustauschen(hand: MutableList<String>, deck: MutableList<String>, index: Int): MutableList<String> {
    if (index in 0 until hand.size) {
        hand[index] = zieheKarte(deck)
    }
    return hand
}

fun main() {
    // Aufgabe 6 und 9
    val deck = erstelleKartendeck()
    println("Wir benutzen das folgende Kartendeck: $deck")
    mischeKartendeck(deck)
    println("Das gemischte Kartendeck: $deck")
    println("Die Anzahl der Karten im Deck: ${kartendeckGroesse(deck)}")
    println("Die erste Karte des Kartendecks: ${zieheKarte(deck)}")

    val hand1 = zieheHand(deck)
    val hand2 = zieheHand(deck)
    println("Hand von Spieler/in 1: $hand1")
    println("Hand von Spieler/in 2: $hand2")

    val punkte = kartenPunkteZuordnen(deck)
    println("Der Wert der Hand von Spieler/in 1: ${handWert(hand1, punkte)}")
    println("Der Wert der Hand von Spieler/in 2: ${handWert(hand2, punkte)}")

    val hand1NachAustausch = karteAustauschen(hand1, deck, 2)
    println("Hand von Spieler/in 1 nach Kartenwechsel: $hand1NachAustausch")
    println("Der neue Wert der Hand von Spieler/in 1: ${handWert(hand1NachAustausch, punkte)}")
}
