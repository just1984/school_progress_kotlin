fun main() {
    val form = Form("Rot")
    form.info()

    val rechteck = Rechteck("Blau", 4.0, 5.0)
    rechteck.info()
    println("Die Fläche des Rechtecks ist ${rechteck.flaeche()}")

    val kreis = Kreis("Grün", 3.0)
    kreis.info()
    println("Die Fläche des Kreises ist ${kreis.flaeche()}")
}