class Mitarbeiter // Konstruktor
    (// Eigenschaften
    private val id: Int,
    private val name: String,
    private var position: String,
    private var gehalt: Double,
    private val artDerBeschäftigung: String,
    private val mutterschaftsUrlaub: Boolean
) {
    // Methoden
    fun gehaltAusgeben() {
        println("$name verdient $gehalt Euro.")
    }

    fun befoerdern(neuePosition: String, gehaltsErhoehung: Double) {
        position = neuePosition
        gehalt += gehaltsErhoehung
    }

    fun istVerfuegbar() {
        if (mutterschaftsUrlaub) {
            println("$name ist zurzeit im Mutterschaftsurlaub und kann nicht arbeiten.")
        } else {
            println("$name ist zurzeit verfügbar und kann arbeiten.")
        }
    }
}
