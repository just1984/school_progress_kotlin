fun main(){
    var umgedrehterSatz = listOf(".", "rückwärts ", "mehr", "nicht", "ist ", "Satz ", "Dieser ")
    println(umgedrehterSatz)
    satzAusgabe(umgedrehterSatz)
}

fun satzAusgabe(list: List<String>) : MutableList<String> {
    // hier dein code
    val lesbarerSatz = mutableListOf<String>()
    for (i in list.size-1 downTo 0){
        lesbarerSatz.add(list[i])
    }
    println(lesbarerSatz)
    return lesbarerSatz
}

// In dieser Aufgabe ist eine List mit Elementen des Datentyps String gegeben.
// Vervollständige die Funktion namens "satzAusgabe" so, dass sie folgende Anweisungen ausführt:
//
//1. Die übergebene Liste auf der Konsole ausgeben.
//2. Mit Hilfe einer Schleife jedes Element von hinten nach vorne in einer neuen Liste (oder MutableListe,
// überlege was hier Sinn macht) namens "lesbarerSatz" speichern
//3. Die Variable lesbarerSatz auf der Konsole ausgeben.