fun main () {
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen")
    // Dein Code hier:
    // In dieser Aufgabe hast du eine MutableList mit Werten gegeben und sollst den ersten Wert am Anfang der MutableList löschen.
    fruits.removeFirst()
    println(fruits)
}