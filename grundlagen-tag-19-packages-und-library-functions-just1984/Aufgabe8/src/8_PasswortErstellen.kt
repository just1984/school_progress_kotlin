fun main() {
    println("BItte gib dein Passwort ein:")
    val passwort = readln()

    val korrigiertesPasswort = passwortKorrektur(passwort)
    println(
        "Dein Passwort war zu kurz und wurde korrigiert.\n" +
                "Dieser Service kostete dich 25 Euro.\n" +
                "Dein neues Passwort lautet: $korrigiertesPasswort\n" +
                "Ciao Trottel."
    )
}
fun passwortKorrektur(passwort: String): String {
    return passwort.padEnd(15, '.').substring(0, 15)
}






/*
Du willst dich bei einer Code-lern-Website anmelden. Dein Passwort muss genau 15 Zeichen lang sein.
Schreibe eine Funktion, welche einen String als Benutzerpasswort entgegennimmt,
ollte das eingegebene Passwort weniger als 15 Zeichen haben, fülle den String mit Punkten(".") bis der String 15 Zeichen lang ist.

Für den Fall, dass der Benutzer ein zu langes Passwort eingegeben hat, müsst ihr dieses ggf.
auch noch auf die richtige Länge kürzen. Nutzt hierfür bereits vorhandene Package-Funktionen!

Lege eine String-Variable an die eine Eingabe vom Nutzer über der Tastatur erfasst.
Nun soll der eingegebene String der Funktion übergeben werden und die Rückgabe per println() ausgegeben werden.*/
