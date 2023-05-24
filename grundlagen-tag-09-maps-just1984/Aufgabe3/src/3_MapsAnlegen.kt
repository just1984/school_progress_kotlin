fun main() {

    //TODO: Schreibe hier deinen Code

    /*  a) Erstelle eine Map über Waren und ihren Preisen. Erstelle eine Map, der Schlüssel ist vom Typ String und der Wert ist vom Typ Double.
      Die Map soll initial (also zu Beginn) mit folgenden Paaren gefüllt sein:*/

    var artikelMap: Map<String, Double> = mapOf(
        "Schokolade" to 1.99,
        "Banane" to 0.29,
        "Yoghurt" to 0.49,
        "Müsli" to 2.99,
    )
    println("Aufgabe 3a): $artikelMap")

    /* b) Erstelle eine MutableMap über Personennamen und ihren Lieblingstieren. Erstelle eine Map, der Schlüssel ist vom Typ String und der Wert ist vom Typ String.
     Die Map soll initial mit folgenden Paaren gefüllt sein:*/

    var lieblingsTiere: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Hunde",
        "Sylvia" to "Eulen",
    )

    println("Aufgabe 3b): $lieblingsTiere")

    /*c) Erstelle eine Map über Hausnummern und der Hausfarbe. Erstelle eine Map, der Schlüssel ist vom Typ Int und der Wert ist vom Typ String.
    Die Map soll initial mit folgenden Paaren gefüllt sein:*/

    var hausFarben: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün",
    )
    println("Aufgabe 3c): $hausFarben")

}
