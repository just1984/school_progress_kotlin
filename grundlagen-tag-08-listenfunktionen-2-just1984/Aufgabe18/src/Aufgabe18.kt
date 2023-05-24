fun main() {
    var unsortedList: MutableList<String> = mutableListOf("Quentin", "Christopher", "Steven", "Alfred", "David")
    // TODO füge hier deinen Code ein
    // Wir wollen in dieser Aufgabe eine Liste von Strings in eine logische Reihenfolge bringen.
    // Beispiel: Eine Liste ["X", "A", "U", "D"] soll am Ende so aussehen: ["A", "D", "U", "X"].
    println(unsortedList)
    var sortedList = unsortedList.sorted()
    println(sortedList)
}