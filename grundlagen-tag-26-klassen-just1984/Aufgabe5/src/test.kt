object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // Mitarbeiter erzeugen
        val mitarbeiter1 = Mitarbeiter(1, "Hans", "Entwickler", 5000.0, "Vollzeit", false)
        val mitarbeiter2 = Mitarbeiter(2, "Anna", "Designerin", 4500.0, "Teilzeit", true)
        val mitarbeiter3 = Mitarbeiter(3, "Peter", "Manager", 6000.0, "Vollzeit", false)

        // Werte ausgeben
        mitarbeiter1.gehaltAusgeben()
        mitarbeiter2.gehaltAusgeben()
        mitarbeiter3.gehaltAusgeben()

        // Beförderungen
        mitarbeiter1.befoerdern("Senior Entwickler", 1000.0)
        mitarbeiter3.befoerdern("Senior Manager", 2000.0)

        // Verfügbarkeit prüfen
        mitarbeiter1.istVerfuegbar()
        mitarbeiter2.istVerfuegbar()
        mitarbeiter3.istVerfuegbar()

        // Werte nach Beförderung ausgeben
        mitarbeiter1.gehaltAusgeben()
        mitarbeiter3.gehaltAusgeben()
    }
}
