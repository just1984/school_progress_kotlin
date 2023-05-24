fun flaecheQuadrat(seitenlaenge_a: Int) {
    println("Aufgabe 1:")
    println("Der Flaecheninhalt des Quadrats mit einer Seitenlaenge von $seitenlaenge_a betraegt: ${seitenlaenge_a * seitenlaenge_a}")
    println("Der Umfang des Quadrats mit einer Seitenlaenge von $seitenlaenge_a betraegt: ${2 * seitenlaenge_a + 2 * seitenlaenge_a}")
    println("")
}

fun flaecheRechteck(seitenlaenge_a: Int, seitenlaenge_b: Int) {
    println("Aufgabe 2:")
    println("Der Flaecheninhalt des Rechtecks mit einer Seitenlaenge von $seitenlaenge_a und $seitenlaenge_b betraegt: ${seitenlaenge_a * seitenlaenge_b}")
    println("Der Umfang des Rechtecks mit einer Seitenlaenge von $seitenlaenge_a und $seitenlaenge_b betraegt: ${2 * seitenlaenge_a + 2 * seitenlaenge_b}")
    println("")
}

fun flaecheKreis(radius: Double) {
    println("Aufgabe 3:")
    println("Der Flaecheninhalt des Kreises mit einem Radius von $radius betraegt: ${3.1415 * radius * radius}")
    println("Der Umfang des Kreises mit einem Radius von $radius betraegt: ${2 * radius * 3.1415}")
    println("")
}

fun main() {
    flaecheQuadrat(14)
    flaecheRechteck(12, 67)
    flaecheKreis(12.4)
}