fun main(){
    println("Wie lange sind Sie schon Kunde bei uns? Bitt geben sie die Anzahl der Jahre ein:")
    var userEingabe = readLine()?.toInt()
    when(userEingabe){
        1 -> println("5€ Amazon-Gutschein Prämie")
        2 -> println("15€ Amazon-Gutschein Prämie")
        3 -> println("25€ Amazon-Gutschein Prämie")
        4 -> println("35€ Amazon-Gutschein Prämie")
        5 -> println("50€ Amazon-Gutschein Prämie")
        else -> println("Keine Prämie")
    }
}