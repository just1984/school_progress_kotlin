fun main() {

    var names: MutableList<String> = mutableListOf("Jimmy", "Hank", "Jesse", "Walter", "Marie", "Skyler")
    /*  TODO füge hier deinen Code ein
        Wir haben eine Liste mit Namen und wollen wissen, ob sich der Name "Walter" in der Liste befindet.
        Erstelle eine neue Boolean-Variable, die uns zeigt, ob sich der Name in der Liste befindet. Benutze dafür die richtige Listenfunktion.*/

    var woistWalter: Boolean = names.contains("Walter")
    println(woistWalter)
}