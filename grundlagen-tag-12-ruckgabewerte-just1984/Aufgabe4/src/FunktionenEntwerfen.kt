fun calculation(): Int {
    println("Bitte gebe 2 natuerliche Zahlen ein:")
    var number1: Int = readln().toInt()
    var number2: Int = readln().toInt()
    return number1 + number2
}
fun umrechnung(): Double {
    println("Wieviele Euros möchtest du in USD wechseln?")
    var userEingabe: Double = readln().toDouble()
    return userEingabe * 1.08
}

fun begruessung(): String {
    return "Hallo liebe*r User*in"
}

fun liste1(): List<String> {
    return listOf<String>("Hallo", "Welt", "!")
}

fun language(){
    var language1: MutableMap<String, Boolean> = mutableMapOf(
        "Lernen wir die Sprache Französisch?" to false,
        "Lernen wir die Sprache Kotlin?" to true
    )
}
fun keineRueckgabenNurPrint() {
    println("")
}

fun main() {
    println(begruessung())
    println("Das Ergebnis ist: ${calculation()}")
    println("Das Ergebnis ist: ${umrechnung()}")
    println(liste1())
}
