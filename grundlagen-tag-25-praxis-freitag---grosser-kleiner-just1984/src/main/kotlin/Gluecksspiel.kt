fun main() {

    var meinDeck = kartendeck.toMutableList()
    var spielerGeld = 100.0

    println("Willkommen beim Kartenglücksspiel!")
    println("Du startest mit $spielerGeld€.")

    while (spielerGeld > 0) {
        println("Wie viel möchtest du setzen?")
        val einsatz = readln()?.toDouble() ?: 0.0

        if (einsatz > spielerGeld) {
            println("Du hast nicht genug Geld, um diesen Betrag zu setzen!")
            continue
        }

        spielerGeld -= einsatz

        println("Rot oder Schwarz? (Antworte mit 'rot' oder 'schwarz')")
        val farbenWahl = readln()?.toLowerCase() ?: ""

        val gezogeneKarte = rotOderSchwarz(meinDeck, farbenWahl)

        if (gezogeneKarte == "") {
            println("Leider verloren! Du hast jetzt ${spielerGeld}€.")
            continue
        }

        println("Höher oder Tiefer als ${kartenWert(gezogeneKarte)}? (Antworte mit 'höher' oder 'tiefer')")
        val wahlHochTief = readln()?.toLowerCase() ?: ""

        if (hochOderTief(meinDeck, kartenWert(gezogeneKarte), wahlHochTief)) {
            spielerGeld += einsatz * 3
            println("Glückwunsch, du hast gewonnen! Du hast jetzt ${spielerGeld}€.")
        } else {
            println("Leider verloren! Du hast jetzt ${spielerGeld}€.")
        }
    }

    println("Leider bist du pleite. Spiel vorbei!")
}
