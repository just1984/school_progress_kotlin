fun main(){
    println("\u001b[31mWillkommen bei Iraqi Airways! Wir freuen uns über ihre Buchung. Bitte geben Sie Ihre Daten ein:")
    println("Bitte geben Sie Ihren Nachnamen ein:")
    val name: String = readln()
    println("Bitte geben Sie Ihren Vornamen ein:")
    val vorname: String = readln()
    println("Bitte geben Sie Ihre E-Mail-Adresse ein:")
    val email: String = readln()
    println("Bitte geben Sie Ihre Telefonnummer ein:")
    val telefonnummer: Int? = readln().toIntOrNull()
    println("Bitte geben Sie Ihr Geburtsjahr ein:")
    val geburtsjahr: Int? = readln().toIntOrNull()
    println("Bitte geben Sie Ihr Reiseziel ein:")
    val reiseziel: String = readln()
    println("Wir bieten grundsätzlich vegane Speisen auf unseren Flügen an. Cool, oder? (true/false):")
    val vegan: Boolean = readln().toBoolean()
    println("Vielen Dank für Ihre Eingaben. Hier ist Ihr Boarding Pass:")
    println("### BOARDING PASS ###")
    println("Name des Fluggastes: $vorname $name")
    println("Mail-Adresse: $email")
    println("Mail-Adresse: $telefonnummer")
    println("Mail-Adresse: $geburtsjahr")
    println("Mail-Adresse: $reiseziel")
    println("VEGAN woop woop $vegan")
}