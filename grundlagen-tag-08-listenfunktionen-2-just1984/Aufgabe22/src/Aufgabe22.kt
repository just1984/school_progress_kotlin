fun main() {

    var primeNumbers: MutableList<Int> = mutableListOf(2, 3, 5, 7, 11, 13)
    val morePrimeNumbers: List<Int> = listOf(17, 19, 23) // ihr könnt diese Liste als Hilfsmittel benutzen
    /*TODO füge hier deinen Code ein
    Wir haben eine Liste mit Zahlen und wollen diese jetzt um die Zahlen 17, 19 und 23 erweitern.
    Da es anstrengend ist, jedes Element einzeln hinzuzufügen wollen wir alle Zahlen in einem Schritt in die Liste setzen. Beispiel: [1,2,3] --> [1,2,3,4,5]
    Benutze dafür die richtige Listenfunktion. Erstellt eine neue Variable, in der ihr die neue Liste speichert.*/
    primeNumbers.addAll(morePrimeNumbers)
    var primeNumbers2 = primeNumbers
    println(primeNumbers2)
}