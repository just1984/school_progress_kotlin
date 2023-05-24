fun main () {
    var ingredients: MutableList<String> = mutableListOf("Kirschen", "Bananen", "Orangen", "Kirschen")
    // Dein Code hier:
    // In dieser Aufgabe hast du erneut eine MutableList mit Werten zu Obstsorten gegeben und sollst diesmal den Wert “Kirschen” am Anfang der MutableList löschen.
    ingredients.remove("Kirschen")
    println(ingredients)
}