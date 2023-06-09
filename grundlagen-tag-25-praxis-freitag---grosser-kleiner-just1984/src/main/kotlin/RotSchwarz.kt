fun rotOderSchwarz() {
    println("Rot oder Schwarz?")
    val benutzerFarbe = readln()

    val meinDeck = kartendeck.toMutableList()
    mischen(meinDeck)
    val gezogeneKarte = eineKarteZiehen(meinDeck)

    println("Die gezogene Karte ist $gezogeneKarte")
    if (kartenFarbe(gezogeneKarte) == benutzerFarbe) {
        println("Glückwunsch! Sie haben richtig geraten.")
    } else {
        println("Leider falsch geraten.")
    }
}

fun main() {
    rotOderSchwarz()
}

fun rotOderSchwarz(deck: MutableList<String>, spielerFarbe: String): String {
    mischen(deck)
    val gezogeneKarte = eineKarteZiehen(deck)
    val karteFarbe = kartenFarbe(gezogeneKarte)
    return if(spielerFarbe.toLowerCase() == karteFarbe.toLowerCase()) gezogeneKarte else ""
}