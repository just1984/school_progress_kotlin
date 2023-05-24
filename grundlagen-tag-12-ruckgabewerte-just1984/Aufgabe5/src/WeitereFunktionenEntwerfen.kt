fun videothek(): List<String> {
    val sortiment: List<String> = listOf("Star Wars", "Shrek", "Toy Story")
    return (sortiment)
}
fun wuerfel(): List<Int> {
    val seiten: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    return (seiten)
}

fun main() {
    println("Moin na, was geht. Das ist unser Film-Sortiment: ${videothek()}")
    println("Welchen Film möchtest du dir ausleihen? (Gib eine Zahl zwischen 1 und 3 ein)")
    val index = readln().toInt() - 1
    println("Du hast dir den Film ${videothek()[index]} ausgeliehen. Viel Spaß damit!")
    println("Warte, ich werfe den Würfel.. und es ist eine: ${wuerfel().random()}")
}