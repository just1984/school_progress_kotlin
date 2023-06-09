import kotlin.random.Random

class Pony(name: String, gewicht: Double, alter: Int, geschlecht: String, val geschwindigkeit: Double)
    : Tier(name, gewicht, alter, geschlecht) {

    override fun geraeuscheMachen() {
        println("$name sagt pfffhueeeepfff.")
    }

    override fun fuettern(besucher: Besucher_in) {
        gewicht *= 1.02
        val futter = if (Random.nextBoolean()) "Zucker" else "Karotte"
        println("$name wurde von ${besucher.name} mit $futter gefüttert. Gewicht ist jetzt $gewicht")
    }

    fun reiten(besucher: Besucher_in) {
        if (alter > 1 && besucher.alter >= 6) {
            println("${besucher.name} reitet $name mit Geschwindigkeit $geschwindigkeit.")
        } else {
            println("${besucher.name} kann $name nicht reiten.")
        }
    }
}
