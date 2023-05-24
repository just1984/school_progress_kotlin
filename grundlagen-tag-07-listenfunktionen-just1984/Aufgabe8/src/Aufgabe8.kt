fun main() {
    //Unter diesem Kommentar deinen Code reinschreiben:
    /*Ergänze mit einem einzigen Befehl diese um die fehlenden Wochentage in der richtigen Reihenfolge.
    Nun gib diese aus und bestimme daraufhin die Länge der Liste (Hier könnt ihr für euch auch vorher schon das Ergebnis erraten.)
    Danach soll die Liste mit einem einzigen Befehl komplett entleert werden und diese erneut ausgeben.
    Bevor ihr das Programm nun laufen lasst,
    ratet wie die Konsole die nun leere Liste ausgibt oder ob vielleicht sogar ein Fehler auftritt. Euer Ergebnis könnt ihr in der Kommentarsektion einfügen.*/

    var wochentage: MutableList<String> = mutableListOf("Montag", "Dienstag", "Mittwoch", "Donnerstag")
    wochentage.addAll(listOf("Freitag", "Samstag", "Sonntag"))
    println(wochentage)
    println(wochentage.size)
}