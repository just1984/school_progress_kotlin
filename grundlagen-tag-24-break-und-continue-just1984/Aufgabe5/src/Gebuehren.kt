fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)
    val totalFees = calculateTotalFees(fees)
    println(totalFees)
}

fun calculateTotalFees(fees: List<Double>): Double {
    var total = 0.0
    for (fee in fees) {
        total += fee
    }
    return total
}



// Wir kriegen von unserem Chef eine Liste mit Gebühren, die zu bezahlen sind.
//Er möchte wissen, wie viel er insgesamt zahlen muss.
//
//Schreibe eine Funktion, die eine Liste mit Gebühren als Parameter bekommt,
//die Gebühren zusammen addiert und das Ergebnis wieder zurückgibt.
//
//Du darfst für deine Lösung nicht die sum() Funktion verwenden.
//Löse das Problem mit einer Schleife.
//Deine Funktion stimmt, wenn du in etwa 5366.78 heraus bekommst,
//(Das Ergebnis kann sich von Computer zu Computer ein ganz kleines bisschen unterscheiden).