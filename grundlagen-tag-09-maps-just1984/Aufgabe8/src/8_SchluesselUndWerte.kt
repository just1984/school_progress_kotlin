fun main() {

    // TODO: Unter diesem Kommentar Aufgabe 8a) bearbeiten:

    var fahrzeuge: Map<String, Double> = mutableMapOf(
        "Auto" to 120.5,
        "Flugzeug" to 755.2,
        "Fahrrad" to 22.0,
        "Tretroller" to 15.7,
        "LKW" to 89.9,
    )
    var fahrzeug1 = fahrzeuge["Auto"]
    var fahrzeug2 = fahrzeuge["Flugzeug"]
    var fahrzeug3 = fahrzeuge["Fahrrad"]
    var fahrzeug4 = fahrzeuge["Tretroller"]
    var fahrzeug5 = fahrzeuge["LKW"]
    println(fahrzeug1)
    println(fahrzeug2)
    println(fahrzeug3)
    println(fahrzeug4)
    println(fahrzeug5)
    var fahrzeug1liste = fahrzeuge.keys.toList()
    println(fahrzeug1liste)

    //b

    var fahrzeugliste = fahrzeuge.values.toList()
    println(fahrzeugliste)
    var maxGeschwindigkeit = fahrzeugliste.max()
    println(maxGeschwindigkeit)

}