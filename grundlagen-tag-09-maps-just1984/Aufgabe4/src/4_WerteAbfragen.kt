fun main() {

    val lieblingsTiere: Map<String, String> = mapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau",
    )
    println(lieblingsTiere)
    println("Das Lieblingstier von Frank sind: ${lieblingsTiere["Frank"]}")
    println("Das Lieblingstier von Sylvia sind: ${lieblingsTiere["Sylvia"]}")
    println("Das Lieblingstier von Hans sind: ${lieblingsTiere["Hans"]}")

    val hausNummerFarbe: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün",
        36 to "Lila",
        92 to "Rosa",
    )
    val farbeHaus1 = hausNummerFarbe[12]
    val farbeHaus2 = hausNummerFarbe[45]
    val farbeHaus3 = hausNummerFarbe[23]
    val farbeHaus4 = hausNummerFarbe[28]
    val farbeHaus5 = hausNummerFarbe[36]
    val farbeHaus6 = hausNummerFarbe[92]

    println("Das Haus mit der Hausnummer 12 hat folgende Farbe: $farbeHaus1")
    println("Das Haus mit der Hausnummer 45 hat folgende Farbe: $farbeHaus2")
    println("Das Haus mit der Hausnummer 23 hat folgende Farbe: $farbeHaus3")
    println("Das Haus mit der Hausnummer 28 hat folgende Farbe: $farbeHaus4")
    println("Das Haus mit der Hausnummer 36 hat folgende Farbe: $farbeHaus5")
    println("Das Haus mit der Hausnummer 92 hat folgende Farbe: $farbeHaus6")

}

