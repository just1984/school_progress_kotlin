fun main() {
    var namensliste = listOf("Lisa", "Marko", "Sebastian", "Marie", "Florian", "Henrik", "Lillie", "Martin")
    // TODO 24a
    println("Bitte gebe eine Zahl zwischen 1-8 ein:")
    var index1 = readln()
    var index2 = index1.toInt()
    var namensAusgabe = namensliste[index2 -1]
    println(namensAusgabe)
    //Todo 24b
    println("Bitte gebe zwei Zahlen zwischen 1-8 ein:")
    var index3: String = readln()
    var index4: String = readln()
    var index5 = index3.toInt()
    var index6 = index4.toInt()
    var teilListe = namensliste.slice(index5 -1 until index6 -1)
    println(teilListe)
}