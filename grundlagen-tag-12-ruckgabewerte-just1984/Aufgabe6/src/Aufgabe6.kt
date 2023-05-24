fun aKreis(): Double {
    println("Wir berechnen jetzt die Fläche deines Kreises. Bitte gebe uns den Radius des Kreises:")
    val userEingabeRadius: Double = readln().toDouble()
    return 3.14 * userEingabeRadius * userEingabeRadius
}
fun main(){
val ergebnis = aKreis()
    println("Das Ergebnis ist: $ergebnis")
}