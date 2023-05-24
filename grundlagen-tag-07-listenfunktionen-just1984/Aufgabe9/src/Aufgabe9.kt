fun main() {
    /*Ein Videothek Besitzer möchte seinen Filmbestand in einer MutableList festhalten.
    Dabei sind ihm allerdings ein paar unerwollte Werte zwischen die Filmnamen gerutscht.
    Nun hat er dich angefragt ihm zu helfen.
    Ändere hierfür die unpassenden Werte im Nachhinein mithilfe des Indexes und
    setze anstelle dieser die Filme "Ironman" und "James Bond" (hier ist egal, welchen
    der beiden Filme ihr für welchen Gegenstand einsetzt) ein und gebe diese anschließend aus.
     */


    var filme: MutableList<String> = mutableListOf(
        "Star Wars",
        "Hockeyschläger",
        "Herr der Ringe",
        "Deadpool",
        "Tastatur",
        "The Wolf of Wall Street",
        "Fluch der Karibik"
    )
    filme[1] = "Ironman"
    filme[4] = "James Bond"
    println(filme)
}