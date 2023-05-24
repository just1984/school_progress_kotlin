/*

 a) Schreibe hier deine Antwort auf die Frage
"Heute regnet es!"

 b) Schreibe hier deine Antwort auf die Frage
 "Leider scheint heute nicht die Sonne und es ist bewölkt."

 c) Schreibe hier deine Antwort auf die Frage
"Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig."
*/

fun main() {
    val sunny = false
    val cloudy = false
    val rainy = false

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            if (rainy) {
                println("Heute regnet es!")
            } else {
                println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
            }
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}