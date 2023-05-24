fun main () {
    // In dieser Aufgabe hast du eine MutableList mit Werten (verschiedene Obstsorten) gegeben und sollst einen Wert an einer bestimmten Stelle verändern.
    // Bitte ersetze den Wert in der Liste an der Stelle mit dem Index 1 durch “Äpfel”.
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen")
    // Dein Code hier:
    fruits[1] = "Äpfel"
    println(fruits)

}