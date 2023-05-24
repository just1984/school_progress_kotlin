/*

 a) Schreibe hier deine Antwort auf die Frage
"Kind ist in Gruppe B"
 b) Schreibe hier deine Antwort auf die Frage
er verwendet "when" statt "if".. sieht uebersichtlicher aus?!
 c) Schreibe hier deine Antwort auf die Frage
Kind ist in Gruppe D
 d) Schreibe hier deine Antwort auf die Frage
"Für dieses Geburtsjahr gibt es keine Gruppe
*/

fun main() {
    val birthyear: Int = 2011

    if (birthyear == 2010) {
        println("Kind ist in Gruppe A")
    } else if (birthyear == 2011) {
        println("Kind ist in Gruppe B")
    } else if (birthyear == 2012) {
        println("Kind ist in Gruppe C")
    } else if (birthyear == 2013) {
        println("Kind ist in Gruppe D")
    } else if (birthyear == 2014) {
        println("Kind ist in Gruppe E")
    } else {
        println("Für dieses Geburtsjahr gibt es keine Gruppe")
    }
}