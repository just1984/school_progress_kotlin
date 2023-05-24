fun main () {
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen", "Kirschen")
    // Dein Code hier:
    // In dieser Aufgabe hast du erneut eine MutableList mit Werten zu Obstsorten gegeben und sollst den letzten Wert am Ende der MutableList mit genau einer Anweisung löschen.
    fruits.removeLast()
    println(fruits)
}