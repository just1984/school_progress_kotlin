fun main() {
    zaehleVonBis(1, 100, true)
    zaehleVonBis(1, 100, false)
}

fun zaehleVonBis(start: Int, ende: Int, aufsteigend: Boolean) {
    if (aufsteigend) {
        var zahl = start
        while (zahl <= ende) {
            println(zahl)
            zahl++
        }
    } else {
        var zahl = ende
        while (zahl >= start) {
            println(zahl)
            zahl--
        }
    }
}