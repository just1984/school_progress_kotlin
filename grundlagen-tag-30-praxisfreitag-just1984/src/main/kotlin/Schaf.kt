class Schaf(name: String, gewicht: Double, alter: Int, geschlecht: String, var wolleSauber: Boolean)
    : Tier(name, gewicht, alter, geschlecht) {

    override fun geraeuscheMachen() {
        println("$name sagt määäh.")
    }

    fun baden() {
        wolleSauber = true
        println("$name nimmt ein Bad.")
    }
}
