fun geografie(countries: Map<String, String>) {
    countries.forEach { (land, hauptstadt) ->
        println("$hauptstadt ist die HaupTtstadt von $land.")
    }
}

fun main() {
    val countries: Map<String, String> = mapOf(
        "Albanien" to "Tirana",
        "Andorra" to "Andorra la Vella",
        "Belgien" to "Brüssel",
        "Bosnien und Herzegowina" to "Sarajevo"
    )

    geografie(countries)
}
