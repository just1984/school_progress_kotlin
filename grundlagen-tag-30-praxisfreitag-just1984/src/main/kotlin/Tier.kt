open class Tier(val name: String, var gewicht: Double, val alter: Int, val geschlecht: String) {
    fun bewegung() {
        println("$name bewegt sich.")
    }

    open fun geraeuscheMachen() {
        println("$name macht Geräusche.")
    }

    fun streicheln(besucher: Besucher_in) {
        println("$name wurde von ${besucher.name} gestreichelt.")
    }

    open fun fuettern(besucher: Besucher_in) {
        gewicht *= 1.02
        println("$name wurde von ${besucher.name} gefüttert. Gewicht ist jetzt $gewicht")
    }
}
