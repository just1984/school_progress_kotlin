fun main () {
    val list : List<String> = listOf("Hallo", "Welt", "!", "Was", "für", "ein", "schöner", "Tag", "!")

    // Erstelle unter diesem Kommentar eine Schleife, die die Liste oben auslesen kann
    var index = 0
    while (index < list.size) {
        println(list[index])
        index++
    }
}