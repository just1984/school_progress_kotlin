class Huhn(name: String, gewicht: Double, alter: Int, geschlecht: String, anzahlEierProTag: Int = 0)
    : Tier(name, gewicht, alter, geschlecht) {
    var anzahlEierTag: Int

    init {
        this.anzahlEierTag = if (geschlecht == "männlich") 0 else anzahlEierProTag
    }

    override fun geraeuscheMachen() {
        println("$name sagt kikiiiriiikiiiiii")
    }
}
