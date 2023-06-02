fun main() {
    // Kommentiere, was diese Zeile macht:
    val wochenTage: List<String> =
        listOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag")
    // Antwort: ERstellt eine Liste mit den Wochentagen

    // Kommentiere, was diese Zeile macht:
    var i: Int = 0
    // Antwort: Erstellt eine VAriable mit dem Namen i vom Typ Int mit dem Wert 0

    // Kommentiere, was diese Zeile macht:
    //
    while (i < wochenTage.size) {
        // Antwort: Solange i kleiner als die Größe der Liste ist wird der Code innerhalb der Klammern ausgeführt
        // Kommentiere, was diese Zeile macht:
        // ANtwort: Gibt den Wert der Liste an der Stelle i aus
        println(wochenTage[i])
        // Kommentiere, was diese Zeile macht:
        // Antwort: Erhöht den Wert von i um 1
        i++
    }
}
/* Verständnisfrage:
    Warum verwenden wir
    (i < wochenTage.size) und nicht etwa
    (i <= wochenTage.size)?
        Probiert aus, was passiert, wenn ihr den < Operator durch <= ersetzt und beantwortet, welcher Fehler auftritt und weshalb!
    Antwort: Weil die Liste bei 0 anfängt und nicht bei 1
*/

