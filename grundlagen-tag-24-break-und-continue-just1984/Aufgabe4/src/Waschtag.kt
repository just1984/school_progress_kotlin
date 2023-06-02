fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )
    val redShirts = mutableListOf<String>()
    val blueShirts = mutableListOf<String>()
    for (tshirt in shirts) {
        if (tshirt == "rot") {
            redShirts.add(tshirt)
        } else if (tshirt == "blau") {
            blueShirts.add(tshirt)
        }
    }
    println("Es gibt ${redShirts.size} rote TShirts.")
    println("Es gibt ${blueShirts.size} blaue TShirts.")

}
