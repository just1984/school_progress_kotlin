fun main() {

    println("\n\n")
    println("AUFGABE 1")

    var sortimentFilme: MutableList<String> = mutableListOf("Star Wars", "Matrix", "Raiders of the lost Ark")
    var preiseFilme: MutableList<Double> = mutableListOf(18.0, 8.4, 11.5)
    val niedrigsterrPreis = preiseFilme.min()
    val hoechsterPreis = preiseFilme.max()

    fun clearVariables() {
        sortimentFilme = mutableListOf("Star Wars", "Matrix", "Raiders of the lost Ark")
        preiseFilme = mutableListOf(18.0, 8.4, 11.5)
    }

    println("\n\n")
    println("AUFGABE 2")

    println("Hallo liebe*r Filmfreund*in und willkommen bei der geilsten Retro-Viodeothek Berlins.")
    println("Das ist unser aktuelles Sortiment: $sortimentFilme. Die Presie reichen von $niedrigsterrPreis bis $hoechsterPreis und das ist wirklich vollkommen okay! Viel Spass beim stöbern!")

    println("\n\n")
    println("AUFGABE 3")

    val guenstigsterPreis = preiseFilme.min()
    val guenstigsterFilmIndex = preiseFilme.indexOf(guenstigsterPreis)
    val guenstigsterFilm = sortimentFilme[guenstigsterFilmIndex]
    println("Der günstigste Film ist $guenstigsterFilm für $guenstigsterPreis Euro. Uff das ist so günstig!!")
    println("Aber davon ab, welcher Film interessiert Sie denn? Bitte nenne den korrekten Filmtitel:")
    var auswahlKunde = readln()
    var indexAuswahlKunde = sortimentFilme.indexOf(auswahlKunde)
    var preisAuswahlKunde = preiseFilme[indexAuswahlKunde]
    println("So, nice. Sie haben sich für $auswahlKunde entschieden. Das waeren dann $preisAuswahlKunde Euro.")

    println("\n\n")
    println("AUFGABE 4")

    var budgetKunde: Double = 50.00
    var budgetKunde2: Double = 50.00
    budgetKunde -= preisAuswahlKunde
    println("Oh ein 50 Euro Schein. Mal sehen ob ich den klein bekomme. 50 Euro minus die Kosten des ausgewaehlten Films von $preisAuswahlKunde sind gleich: $budgetKunde.")
    println("Hier bitte, das Rückgeld! Viel Spass damit.")
    sortimentFilme.remove(auswahlKunde)
    preiseFilme.removeAt(indexAuswahlKunde)

    println("\n\n")
    println("AUFGABE 5")

    sortimentFilme.addAll(listOf("The Batman"))
    preiseFilme.addAll(listOf(19.99))
    println("Hallo liebe*r Filmfreund*in und willkommen bei der geilsten Retro-Viodeothek Berlins.")
    println("Das ist unser aktuelles Sortiment: $sortimentFilme. Die Presie reichen von $niedrigsterrPreis bis $hoechsterPreis.")
    println("Was darf es denn sein? Bitte nenne mir den genauen Titel:")
    auswahlKunde = readln()
    indexAuswahlKunde = sortimentFilme.indexOf(auswahlKunde)
    preisAuswahlKunde = preiseFilme[indexAuswahlKunde]
    println("So, nice. Sie haben sich für $auswahlKunde entschieden. Das waeren dann $preisAuswahlKunde Euro.")
    budgetKunde2 -= preisAuswahlKunde
    println("Oh ein 50 Euro Schein. Mal sehen ob ich den klein bekomme. 50 Euro minus die Kosten des ausgewaehlten Films von $preisAuswahlKunde sind gleich: $budgetKunde2.")
    println("Hier bitte, das Rückgeld! Viel Spass damit.")
    sortimentFilme.remove(auswahlKunde)
    preiseFilme.removeAt(indexAuswahlKunde)

    println("\n\n")
    println("AUFGABE 6")

    clearVariables()
    var sortimentFilmeMap: MutableMap<String, Double> = sortimentFilme.zip(preiseFilme).toMap().toMutableMap()
    sortimentFilmeMap["The Batman"] = 19.99
    println("Unsere aktuellen Filme und ihre Preise, dargestellt in einer Map, sind: $sortimentFilmeMap")

    println("\n\n")
    println("AUFGABE 7")

    println("Hallo ich bin Kunde XYZ. Haben Sie Batman vorraetig?")
    println("Sekunde, ich checke das mal kurz ab.. Computer-Noise: Piep Piep Piep")
    val kundenAnfrage = sortimentFilmeMap.contains("The Batman")
    var kostenBatman = sortimentFilmeMap["The Batman"]
    var budgetKunde3: Double = 50.00
    println("Computer sagt: Anfrage ist: $kundenAnfrage!")
    println("Ich soll Ihnen vom Computer ausrichten, dass der Film vorraetig ist! Dieser kostet nur: $kostenBatman!")
    budgetKunde3 -= kostenBatman!!
    println("Oh ein 50 Euro Schein. Mal sehen ob ich den klein bekomme. 50 Euro minus die Kosten des ausgewaehlten Films von $kostenBatman sind gleich: $budgetKunde3.")
    println("Hier bitte, das Rückgeld! Viel Spass damit.")
    sortimentFilmeMap.remove("The Batman")
    println("Das aktuelle Sortiment ist: $sortimentFilmeMap")

    println("\n\n")
    println("AUFGABE 8")
    println("Das aktuelle Sortiment aller Filme ist: ${sortimentFilmeMap.keys}")
    println("Die dazugehoerigen Preise sind: ${sortimentFilmeMap.values}")

}