/*

 Schreibe hier deine Antwort auf die Frage

Cloudy ist true und deswegen wird "Leider scheint heute nicht die Sonne und es ist bewölkt." ausgegeben.

*/

fun main() {
    val sunny = false
    val cloudy = true

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}