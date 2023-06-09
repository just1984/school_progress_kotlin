class StreichelZoo(tiere: List<Tier>) {
    var tiere: MutableList<Tier> = tiere.toMutableList()
    var besucher: MutableList<Besucher_in> = mutableListOf()

    fun neuerBesucher(besucher: Besucher_in) {
        if (this.besucher.size < 5) {
            this.besucher.add(besucher)
            besucher.vorstellen()
            tiereUndIhreGeraeusche()
        } else {
            println("Leider ist der Zoo voll. ${besucher.name} kann nicht betreten.")
        }
    }

    fun exit(besucher: Besucher_in) {
        this.besucher.remove(besucher)
        println("${besucher.name} hat den Streichelzoo verlassen.")
    }

    private fun tiereUndIhreGeraeusche() {
        for (tier in tiere) {
            tier.geraeuscheMachen()
        }
    }

    fun rennen(pony1: Pony, pony2: Pony) {
        val gewinner = if (pony1.geschwindigkeit > pony2.geschwindigkeit) pony1 else pony2
        println("Das Pony ${gewinner.name} hat das Rennen gewonnen!")
    }
}
