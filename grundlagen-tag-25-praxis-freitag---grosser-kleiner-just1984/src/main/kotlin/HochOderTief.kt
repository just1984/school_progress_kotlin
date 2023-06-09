fun hochOderTief(deck: MutableList<String>, vorlageWert: Int, spielerWahl: String): Boolean {
    mischen(deck)
    val gezogeneKarte = eineKarteZiehen(deck)
    val karteWert = kartenWert(gezogeneKarte)
    return if(spielerWahl == "höher") karteWert > vorlageWert else karteWert < vorlageWert
}

fun main() {

    var meinDeck = kartendeck.toMutableList()

    println("Höher oder Tiefer als 7? (Antworte mit 'höher' oder 'tiefer')")
    val spielerWahl = readln()

    if (hochOderTief(meinDeck, 7, spielerWahl)) {
        println("Du hast gewonnen!")
    } else {
        println("Leider verloren!")
    }
}