fun main() {
    // Besucher_in
    val besucher1 = Besucher_in("Bo", 10)
    println("Besucher*innen-Name: ${besucher1.name}, Besucher*innen-Alter: ${besucher1.alter}")

    // Tier
    val tier1 = Tier("ZickeZacke", 20.0, 5, "männlich")
    println("Tier-Name: ${tier1.name}, Tier-Gewicht: ${tier1.gewicht}, Tier-Alter: ${tier1.alter}, Tier-Geschlecht: ${tier1.geschlecht}")

    // Schaf
    val schaf1 = Schaf("Olaf", 70.0, 2, "weiblich", false)
    println("Schaf-Name: ${schaf1.name}, Schaf-Gewicht: ${schaf1.gewicht}, Schaf-Alter: ${schaf1.alter}, Schaf-Geschlecht: ${schaf1.geschlecht}, Ist die Wolle sauber?: ${schaf1.wolleSauber}")

    // Kuh
    val kuh1 = Kuh("Dicke", 400.0, 4, "weiblich")
    println("Kuh-Name: ${kuh1.name}, Kuh-Gewicht: ${kuh1.gewicht}, Kuh-Alter: ${kuh1.alter}, Kuh-Geschlecht: ${kuh1.geschlecht}, Gibt die Kuh Milch?: ${kuh1.gibtMilch}")

    // Huhn
    val huhn1 = Huhn("Kiki", 1.2, 2, "weiblich")
    println("Huhn-Name: ${huhn1.name}, Huhn-Gewicht: ${huhn1.gewicht}, Huhn-Alter: ${huhn1.alter}, Huhn-Geschlecht: ${huhn1.geschlecht}, Anzahl Eier pro Tag: ${huhn1.anzahlEierTag}")

    // Pony
    val pony1 = Pony("Poncho", 200.0, 3, "männlich", 30.0)
    println("Pony-Name: ${pony1.name}, Pony-Gewicht: ${pony1.gewicht}, Pony-Alter: ${pony1.alter}, Pony-Geschlecht: ${pony1.geschlecht}, Geschwindigkeit des Ponys: ${pony1.geschwindigkeit}")
}
