fun main(){
    var list = listOf<Int>(1,2,3,4,5,6,7)
    println(list)
    println(listBack(list))
}

fun listBack(liste: List<Int>): MutableList<Int>{
    var mutableList = mutableListOf<Int>()
    var i = 0
    while(i < liste.size){
        mutableList.add(liste[i])
        i += 2
    }
    return mutableList
}

// Schreibe eine Funktion, die eine Liste erhält und eine MutableListe wieder zurückgibt.
//Lege in der Funktion eine MutableListe an.
//Füge jetzt mithilfe einer While-Schleife jedes 2. Element, aus der als Parameter übergebenen Liste, zur neu erstellten MutableListe hinzu.
//Gib dann die MutableListe zurück.
//
//Teste anschließend, ob die MutableListe auch wirklich nur jedes 2. Element aus der ursprünglichen Liste enthält.
//
//Ein Beispiel:
//Parameter: List = [0, 1, 2, 3, 4, 5]
//Rückgabe: MutableList = [1, 3, 5]