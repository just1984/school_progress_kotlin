import kotlin.random.Random

fun main() {

    var euro: Int = 0
    var kontostandInYen: Int = 500
    val wechselkurs: Double = 142.6

    println("Dein Kontostand in Yen beträgt: $kontostandInYen")
    println("Wieviel Euro willst du heute einzahlen?")
    val eingabe: String = readln()

    euro = eingabe.toInt()
    kontostandInYen += (euro * wechselkurs).toInt()

    println("Bei dem aktuellen Wechselkurs (YEN-EUR = 142.6) beträgt dein neuer Kontostand in Yen: $kontostandInYen YEN")
    println("In Euro beträgt dein neuer Kontostand: ${kontostandInYen / 142.6} EURO")

    println("Eine gute Freundin schenkt dir ein Rubbellos. Rubbelst du es?")
    readln()

    val zufallsEreignis = Random.nextInt(1, 101)
    if (zufallsEreignis <= 80) {
        println("GLÜCKWUNSCH, du hast den Jackpot geknackt! Du erhältst 100% mehr Yen!")
        kontostandInYen = (kontostandInYen * 2).toInt()
    } else if (zufallsEreignis <= 100) { // Ändere die Bedingung hier
        println("Nichts, du hast leider verloren. Du erhältst 5% weniger Yen.")
        kontostandInYen = (kontostandInYen * 0.95).toInt() // Ändere die Berechnung hier
    }

    println("Bei dem aktuellen Wechselkurs (YEN-EUR = 142.6) beträgt dein neuer Kontostand in Yen: $kontostandInYen YEN")
    println("In Euro beträgt dein neuer Kontostand: ${kontostandInYen / 142.6} EURO")

}
