fun main(){
    var kontostand: Int = 650
    val ticketpreis: Int = 125

    println("\u001b[31mWillkommen beim digitalen Ticketschalter.")
    println("Sie möchten mit Ihrer Familie verreisen? Schön. Wieviele Tickets möchten Sie buchen?")

    val anzahltickets: Int = readln().toInt()
    val gesamtpreis: Int = anzahltickets * ticketpreis
    // var kontostandrest: Int = kontostand - gesamtpreis
    kontostand -= gesamtpreis

    println("Nice, Sie haben $anzahltickets Tickets ausgewählt. Das macht zusammen: $gesamtpreis Euro.")
    println("KATCHING!! Drücken Sie bitte ENTER wenn Sie eine Rechnung wünschen:")
    readln()
    println("")
    println("###")
    println("RECHNUNG")
    println("Kosten Tickets: $ticketpreis")
    println("Anzahl Tickets: $anzahltickets")
    println("Gesamtpreis: $gesamtpreis")
    println("Ihr alter Kontostand betrug: ${kontostand + gesamtpreis} Euro.")
    println("Ihr neuer Kontostand beträgt: $kontostand Euro.")
    println("###")
}
