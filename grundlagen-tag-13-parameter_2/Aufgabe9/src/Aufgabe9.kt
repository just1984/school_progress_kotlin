fun umrechnung(euro: Double): Double {
    return euro * 1.08
}

fun main() {
    println("Wieviel Euro möchtest du wechseln?")
    println("Das sind ${umrechnung(readln().toDouble())} Dollar.")
}
