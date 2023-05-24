
fun main(){
    println("Bitte gebe eine Zahl von 1-12 an:")
    var userEingabe = readLine()!!.toInt()
    when(userEingabe){
        1 -> println("Januar")
        2 -> println("Februar")
        3 -> println("März")
        4 -> println("April")
        5 -> println("Mai")
        6 -> println("Juni")
        7 -> println("Juli")
        8 -> println("August")
        9 -> println("September")
        10 -> println("Oktober")
        11 -> println("November")
        12 -> println("Dezember")
        else -> println("Fehler")
    }
}