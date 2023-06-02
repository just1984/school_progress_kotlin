fun main() {
    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)
    //Implementiere unter diesem Kommentar die in der Aufgabe beschriebene while-Schleife
    println(list)
    var index = 0
    while (index < list.size) {
        list[index] = list[index] * 2
        index++
    }
    println(list)
}

//In dieser Aufgabe ist eine MutableList gegeben.
//Mithilfe einer while-Schleife sollst du jetzt jeden Wert aus der MutableList verdoppeln und wieder an der gleichen Stelle abspeichern.
//Gib dann die ganze MutableList aus.
//Haben sich die Werte verdoppelt?