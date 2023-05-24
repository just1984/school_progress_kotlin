// Fixe den Compilerfehler
// Schaue dir den Code an, überlege was hier nicht stimmt und korrigiere dann den Fehler.
// Danach soll beim Kompilieren des Programms kein Fehler mehr ausgegeben werden.

fun fehler1(zahl2: Int) {
    var zahl1 : Int = 10
    println(zahl1 * zahl2)
}

fun main() {
    fehler1(4)
}