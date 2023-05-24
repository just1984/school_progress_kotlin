fun main(){

/*  - Erstelle eine Liste in der du deine Postleitzahl und deine Hausnummer speicherst
    - Erstelle eine weitere Liste in der du deinen Namen, deine Straße und deinen Wohnort speicherst
    - Lasse dir nun deine Adresse sinnvoll ausgeben
    - Eine mögliche Lösung könnte so aussehen:*/

    val postleitzahlHausnummer: List<Int> = listOf(12049,26)
    val nameStrasseWohnort: List<String> = listOf("Super Bo 3000", "Okerstrasse", "Berlin")
    println(nameStrasseWohnort[0])
    println("${nameStrasseWohnort[1]} ${postleitzahlHausnummer[1]}")
    println("${postleitzahlHausnummer[0]} ${nameStrasseWohnort[2]}")
}