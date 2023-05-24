// Schreibe eine Funktion, die eine MutableList übergeben bekommt, diese mischt und anschließend zurückgibt.

fun mischeMachen(eingabe: MutableList<String>){
    eingabe.shuffle()
    println(eingabe)
}
fun main(){
    mischeMachen(mutableListOf("Hallo", "Wassup", "Que Pasa", "Holà"))
}
