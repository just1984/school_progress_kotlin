fun main() {
    /*Unter diesem Kommentar deinen Code reinschreiben:
    Entferne den ersten und den letzten Eintrag der Liste und gib die ganze Liste am Ende aus.
    Das Ergebnis sollte dann so aussehen: [4, 6]
    (Tipp: man kann eine ganze Liste mithilfe von println(<listenname>) ausgeben)*/

    var liste: MutableList<Int> = mutableListOf(5, 4, 6, 7)
    println(liste.first())
    println(liste.last())
    liste.remove(liste.first())
    liste.remove(liste.last())
    println(liste)
}