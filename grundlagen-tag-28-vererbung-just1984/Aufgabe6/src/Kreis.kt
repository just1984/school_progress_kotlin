class Kreis(override val farbe: String, val radius: Double) : Form(farbe) {
    fun flaeche() = Math.PI * radius * radius
}