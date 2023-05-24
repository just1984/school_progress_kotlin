fun main() {

    /*    Erstelle eine Liste vom Typ Integer mit den ersten 7 Primzahlen.
        Hinweis: - Es ist nicht Teil der Aufgabe die Primzahlen zu berechnen, sondern ihr sollt diese nur auflisten.
        Solltet ihr die ersten 7 Primzahlen nicht kennen, könnt ihr gerne im Internet nach diesen suchen.
        Addiere die Primzahl an der ersten Position der Liste mit der Primzahl an der zweiten Position
        und speichere das Ergebnis in einer neuen Variablen.*/

    val primZahlen: List<Int> = listOf(2, 3, 5, 7, 11, 13, 17)
    val summe: Int = primZahlen[0] + primZahlen[1]
    println(summe)

}