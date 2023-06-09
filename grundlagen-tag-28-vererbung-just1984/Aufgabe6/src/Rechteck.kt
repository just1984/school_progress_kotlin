class Rechteck(override val farbe: String, val breite: Double, val hoehe: Double) : Form(farbe) {
    fun flaeche() = breite * hoehe
}