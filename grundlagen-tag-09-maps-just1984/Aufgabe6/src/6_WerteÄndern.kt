fun main() {

    val personPetMap: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau",
    )

    //TODO: Schreibe hier deinen Code:
    println(personPetMap)
    personPetMap["Berta"] = "Esel"
    personPetMap["Sylvia"] = "Pferde"
    personPetMap["Frank"] = "Spechte"
    personPetMap["Luis"] = "Spechte"
    println(personPetMap)
}

    /*b) Kann eine Map oder MutableMap diese zwei Paare enthalten?
    "Berta" -> "Hunde"
    "Berta" -> "Katzen"
    Falls nein, was müsste man ändern, damit es möglich ist?*/
    // Nein, denn sie benutzen den selben Key. Ein Key kann nur einmal existieren. WIr koennten einen zuweiten key anlegen zB