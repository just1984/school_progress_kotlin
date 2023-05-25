import kotlin.math.sqrt
import kotlin.math.pow

fun main(){
    pytagoras()
}

fun pytagoras(){
    println("")
    println("")
    println("Wir wollen die Laenge der Kante C in einem rechtwinkligen Dreieck berechnen.\n" +
            "Gegeben sind die Laenge der Seite A und die Laenge der Seite B. Debe diese nun ein und bestätige jede Eingabe mit Enter.")
    val seitenLaengeA = readln().toDouble()
    val seitenLaengeB = readln().toDouble()
    println("")
    println("")
    println("Thanks. It will take me 7 1⁄2 million years to compute and check the answer. Please wait..")
    println("")
    println("")
    Thread.sleep(6000)
    println("88888b   d888b  88b  88 8 888888    88888b   888    88b  88 88  d888b  88")
    println("88   88 88   88 888b 88 P   88      88   88 88 88   888b 88 88 88      88")
    println("88   88 88   88 88`8b88     88      88888P 88   88  88`8b88 88 88      88")
    println("88   88 88   88 88 `888     88      88    d8888888b 88 `888 88 88        ")
    println("88888P   T888P  88  `88     88      88    88     8b 88  `88 88  T888P  88")
    Thread.sleep(6000)
    println("")
    println("")
    val seitenLaengeC = sqrt(seitenLaengeA.pow(2) + seitenLaengeB.pow(2))
    println("Lucky you.. here we go: Die Laenge der Seite C betraegt: 42.")
    Thread.sleep(6000)
    println("Oder auch: $seitenLaengeC")
}