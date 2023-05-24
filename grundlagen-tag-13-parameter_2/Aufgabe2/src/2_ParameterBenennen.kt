fun addition(zahl2: Int) {
    val zahl1: Int = 10
    println(zahl1 + zahl2)
}
fun main() {
    println("Bitte gebe eine Zahgl ein die mir 10 addiert werden soll:")
    addition(readln().toInt())
}