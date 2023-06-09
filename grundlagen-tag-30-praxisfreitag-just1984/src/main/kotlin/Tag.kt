fun main() {
    val schaf1 = Schaf("Pumpidumm", 70.0, 2, "weiblich", false)
    val schaf2 = Schaf("FluffFluff", 65.0, 3, "weiblich", true)
    val huhn1 = Huhn("Kiki", 1.2, 2, "weiblich")
    val huhn2 = Huhn("Hunsii", 1.3, 1, "männlich")
    val kuh = Kuh("DIcke", 400.0, 4, "weiblich")
    val pony1 = Pony("Poncho", 200.0, 3, "männlich", 30.0)
    val pony2 = Pony("Honcho", 210.0, 2, "weiblich", 25.0)

    val zoo = StreichelZoo(listOf(schaf1, schaf2, huhn1, huhn2, kuh, pony1, pony2))

    val besucherListe = mutableListOf(
        Besucher_in("Javan", 10),
        Besucher_in("Sophie", 8),
        Besucher_in("Rachel", 12),
        Besucher_in("Bo", 11),
        Besucher_in("Tom", 13),
        Besucher_in("Geo", 9)
    )

    for (besucher in besucherListe) {
        zoo.neuerBesucher(besucher)
        pony1.reiten(besucher)
        pony2.reiten(besucher)
    }

    schaf1.fuettern(besucherListe[0])
    huhn1.bewegung()
    kuh.streicheln(besucherListe[1])
    kuh.streicheln(besucherListe[2])
    zoo.exit(besucherListe[0])
    zoo.exit(besucherListe[1])
    kuh.melken(besucherListe[2])

    for (tier in zoo.tiere) {
        tier.fuettern(besucherListe[3])
    }

    for (tier in zoo.tiere) {
        if (tier is Schaf && !tier.wolleSauber) {
            tier.baden()
        }
    }

    zoo.rennen(pony1, pony2)

    while (zoo.besucher.isNotEmpty()) {
        zoo.exit(zoo.besucher[0])
    }
}
