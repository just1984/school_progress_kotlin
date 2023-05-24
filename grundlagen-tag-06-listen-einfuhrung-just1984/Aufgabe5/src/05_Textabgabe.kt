fun main() {

    /*Lasse dir den letzten James-Bond-Darsteller auf der Konsole ausgeben.
    Hinweis: Arbeite dafür mit list.size als Index*/

    var bondDarsteller: List<String> = listOf(
        "Sean Connery",
        "George Lazenby",
        "Roger Moore",
        "Timothy Dalton",
        "Pierce Brosnan",
        "Daniel Craig"
    )

    var letzterDarsteller: String = bondDarsteller[bondDarsteller.size - 1]
    println(letzterDarsteller)
}