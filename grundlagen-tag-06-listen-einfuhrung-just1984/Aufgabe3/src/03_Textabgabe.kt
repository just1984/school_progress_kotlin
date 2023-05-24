fun main() {

    /*   Gebe die Länge der gegebenen Liste aus
       Lasse dir deinen Lieblings-James-Bond-Film aus der Liste auf der Konsole ausgeben.
       Ergänze die Liste um den neuesten James-Bond-Film*/

    val bondFilme: MutableList<String> = mutableListOf(
        "James Bond 007 – Octopussy",
        "James Bond 007 – Im Angesicht des Todes",
        "James Bond 007 – Der Hauch des Todes",
        "James Bond 007 – Lizenz zum Töten",
        "James Bond 007 – GoldenEye",
        "James Bond 007 – Der Morgen stirbt nie",
        "James Bond 007 – Die Welt ist nicht genug",
        "James Bond 007 – Stirb an einem anderen Tag",
        "James Bond 007: Casino Royale",
        "James Bond 007: Ein Quantum Trost",
        "James Bond 007: Skyfall",
        "James Bond 007: Spectre"
    )

    println(bondFilme.size)
    println(bondFilme[5])
    // bondFilme += "James Bond 007: No Time to Die"
    bondFilme.add("James Bond 007: No Time to Die")
    println(bondFilme.size)
    println(bondFilme)

}