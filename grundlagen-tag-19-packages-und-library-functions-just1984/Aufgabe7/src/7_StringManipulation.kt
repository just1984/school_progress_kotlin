fun main() {
    val zungenbrecher: String = "Aslronaulen kauten und kauten während sie blaugrüne Mondsteine klaubten."
    println(zungenbrecher)
    val korrigiert = korrekturZungenbrecher(zungenbrecher)
    println(korrigiert)
}

fun korrekturZungenbrecher(zungenbrecher: String): String {
    val index = zungenbrecher.indexOf("Aslronaulen")
    val korrigiert = zungenbrecher.replaceRange(index, index + 11, "Astronauten")
    return korrigiert
}



/*
In unserem zungenbrecher String hat sich leider ein Fehler im ersten Wort eingeschlichen.
Anstelle von Aslronaul sollte eigentlich Astronaut stehen.
Schreibe eine Funktion, welche den String zungenbrecher entgegennimmt,
das erste Wort berichtigt und dann die verbesserte Version zurückgibt.
Allerdings sollt ihr hier primär mit Funktionen arbeiten und
nicht einfach die einzelnen Indizes manuell verändern.
Hilfreich ist hier, dass Strings intern wie Listen von Chars behandelt werden.
Also kann man viele der Listenfunktionen auf Strings anwenden.
hilfreiche Funktionen hier sind : .indexOf() .slice() .replace() .substring()*/
