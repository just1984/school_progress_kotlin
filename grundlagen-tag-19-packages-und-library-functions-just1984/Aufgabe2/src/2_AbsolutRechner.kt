import kotlin.math.abs

fun main() {
    println("Bitte gEben Sie eine Zahl ein:")
    val num = readln().toDouble()
    val result = abs(num)
    println("Der absolute Betrag von $num ist $result")
}