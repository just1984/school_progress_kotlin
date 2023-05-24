fun main() {
   /* Unter diesem Kommentar deinen Code reinschreiben:
    Erstelle zwei Listen mit Integer Elementen. Die erste Liste beinhaltet die Werte 4, 8, 3 und die zweite Liste 2, 4, 9 in dieser Reihenfolge.
    Füge der ersten Liste die Zahl 3 hinzu. Füg der zweiten Liste die Zahl 6 hinzu.
    Greife jeweils über den Index auf die letzten Elemente der Liste (in diesem Fall 3 und 6) zu und gib das Ergebnis ihrer Addition aus.
    Das Ergebnis sollte 9 sein*/

    var liste1: MutableList<Int> = mutableListOf(4,8,3)
    var liste2: MutableList<Int> = mutableListOf(2,4,9)

    liste1.add(3)
    liste2.add(6)

    println(liste1.last())
    println(liste2.last())

    println(liste1.last() + liste2.last())

}