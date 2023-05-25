import kotlin.math.sqrt
fun main(){
    println("Bitte gebe mir eine Double aus die die Quadratwurzel erechnet werden soll:")
    var userDouble = readln().toDouble()
    var ergebnis = sqrt(userDouble)
    println("Das Ergebnis lautet: $ergebnis")
}