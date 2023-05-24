fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    var number = 0

    try {
        number = numbers[10]
    } catch (e: Exception) {
        println("Ein Fehler ist aufgetreten: Der Index liegt außerhalb der Liste.")
        number = -1
    }

    println("Der Wert von 'number' ist: $number")
}
