class Kuh(name: String, gewicht: Double, alter: Int, geschlecht: String) : Tier(name, gewicht, alter, geschlecht) {
    var gibtMilch: Boolean

    init {
        gibtMilch = if (alter >= 3 && geschlecht == "weiblich") true else false
    }

    override fun geraeuscheMachen() {
        println("$name sagt Muuuuhh.")
    }

    fun melken(besucher: Besucher_in) {
        if (gibtMilch) {
            println("${besucher.name} melkt $name.")
        } else {
            println("$name gibt keine Milch.")
        }
    }
}
