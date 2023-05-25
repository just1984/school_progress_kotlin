import kotlin.math.sqrt

fun main() {
seitenLaenge()
}

fun seitenLaenge() {
    println("Bitte gebe die Fläche eines Quadrats ein (Double).")
    val flaeche = readln().toDouble()
    val seitenlaenge = sqrt(flaeche)
    println("Die Seitenlaenge ist: $seitenlaenge")
}
