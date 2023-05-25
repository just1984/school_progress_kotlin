import kotlin.math.round

fun main() {
    println("Bitte geben Sie eine Dezimal-Zahl ein:")
    val num = readln().toDouble()
    val result = round(num)
    println("Die aufgerundete Zahl von $num ist $result")
}
