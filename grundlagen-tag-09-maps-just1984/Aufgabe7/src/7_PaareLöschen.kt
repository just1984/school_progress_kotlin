fun main() {

    var favouritePetsMap = mutableMapOf<String, String>(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau",
    )
    //TODO: Schreibe hier deinen Code:

    println(favouritePetsMap)
    favouritePetsMap.remove("Frank")
    favouritePetsMap.remove("Hans")
    println(favouritePetsMap)
    //b)
    favouritePetsMap.remove("Luis")
    println(favouritePetsMap)
    favouritePetsMap.remove("Frank", "Mäuse")
    println(favouritePetsMap)


}