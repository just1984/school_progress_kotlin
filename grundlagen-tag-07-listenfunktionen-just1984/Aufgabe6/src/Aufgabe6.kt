fun main() {
    /*Unter diesem Kommentar deinen Code reinschreiben:
      Erstelle eine Liste mit dem Namen eisListe und fülle die Liste bei der Erstellung mit den String-Elementen "Schokolade", "Zitrone", "Haselnuss".
      Nach der Initialisierung der Liste füge der Liste mit der .add Methode eine zusätzliche Eissorte deiner Wahl hinzu.
      Gib das letzte Element der Liste aus.*/
    var eisListe: MutableList<String> = mutableListOf("Schokolade", "Zitrone", "Haselnuss")
    eisListe.add("Veganes salziges Erdnusscrunch")
    println(eisListe)
    println("Das letzte Element in der Liste ist ${eisListe.last()}")
}