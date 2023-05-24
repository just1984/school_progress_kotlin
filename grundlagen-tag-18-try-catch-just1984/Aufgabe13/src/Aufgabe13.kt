fun main() {
    val wuerfelSeiten: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println("Spieler*in 1, bitte drücke Enter um den Wuerfel zu werfen:")
    readln()
    val ergebnis1 = wuerfelSeiten.random()
    println("Oh eine $ergebnis1, nice!")
    println("Spieler*in 2, bitte drücke Enter um den Wuerfel zu werfen:")
    readln()
    val ergebnis2 = wuerfelSeiten.random()
    println("Oh eine $ergebnis2, nice!")

    if (ergebnis1 > ergebnis2) {
        println("Spieler*in 1 gewinnt: Spieler*in 1 hat mit Augenzahl $ergebnis1 gegenüber Spieler*in 2 mit Augenzahl $ergebnis2 gewonnen.")
    } else if (ergebnis1 == ergebnis2) {
        println("Unentschieden: Beiden Spieler*innen haben die selbe Augenzahl gewürfelt.")
    } else {
        println("Spieler*in 2 gewinnt: Spieler*in 2 hat mit Augenzahl $ergebnis2 gegenüber Spieler*in 1 mit Augenzahl $ergebnis1 gewonnen.")
    }
}