fun main() {
    var names: MutableList<String> = mutableListOf("Jim", "Pam", "Oscar", "Pam", "Dwight")
    /*TODO füge hier deinen Code ein
      Hier ist jetzt nochmal eine etwas knifflige Aufgabe zum Listenindex.
      Wir möchten die Stelle in der Liste finden, an der "Pam" das letzte Mal auftaucht. Beispiel: in dieser Liste ["A", "Y", "A", "D"] taucht das "A" zuletzt bei Index 2 auf.*/
    val zuletztPam = names.lastIndexOf("Pam")
    println(zuletztPam)
}