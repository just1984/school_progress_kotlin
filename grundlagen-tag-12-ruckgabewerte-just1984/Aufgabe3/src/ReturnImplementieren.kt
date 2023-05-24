// Schreibe eine Funktion tenTimes, die das zehnfache einer vom
// Nutzer eingelesenen Zahl zurückgeben soll.
// Gib den Rückgabewert in einem print-Statement in der main Funktion aus

fun tenTimes(): Double {
    println("Bitte geben Sie eine natuerliche Zahl ein. Diese wird dann zehnfach ausgegeben.")
    var eingabeUser = readln()
    var eingabeUserDouble = eingabeUser.toDouble()
    return eingabeUserDouble * 10
}

fun main() {
    println("Das zehnfache der eingegebenen Zahl ist: ${tenTimes()}")
}