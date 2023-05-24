fun main() {
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen")
    // Dein Code hier:
    // In dieser Aufgabe hast du erneut eine MutableList mit Werten zu Obstsorten gegeben und sollst den Wert “Kirschen” am Anfang der MutableList hinzufügen.
    fruits.add(0, "Kirschen")
    println(fruits)
}