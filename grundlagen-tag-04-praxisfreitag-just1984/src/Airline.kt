fun main() {
    val sitzplaetze: Int = 130
    val familie: Int = 4
    val ticketpreis: Int = 125
    val streckenKosten: Double = 16 * 1034.93

    println("\u001B[31mEs passen ${sitzplaetze / familie} Familen in das Flugzeug.")
    println("Wenn das Flugzeug mit 25 Familien besetzt ist, sind das insgesamt ${familie * 25} Personen die Tickets gekauft haben.")
    println("Das bedeutet, dass wir noch ${130 - familie * 25} freie Plätze im Flugzeug haben.")
    println("Mit ${familie * 25} verkauften Tickets haben wir bei einem Ticketpreis von 125 Euro insgesamt ${familie * 25 * ticketpreis} Euro eingenommen.")
    println("Der Flug kostet uns als Fluggesellschaft: $streckenKosten Euro.")
    println("Wenn der Flug komplett mit 130 zahlenden Fluggaesten ausgelastet ist, würde sich ein Gewinn/Verlust von ${130 * ticketpreis - streckenKosten} ergeben.")
    println("Gerundet sieht das Ergebnis so aus: ${(130 * ticketpreis - streckenKosten).toInt()} Euro.")
}
