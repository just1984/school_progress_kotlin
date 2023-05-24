/*
In dieser Aufgabe sollst du eine verschachtelte If-Abrage schreiben.
In deinem Programm soll der Nutzer gefragt werden, ob er heute rausgeht. Außerdem soll er gefragt werden ob es regnet.

Abhängig von den Antworten soll auf Konsole eine Empfehlung ausgegeben werden:

Wenn der Nutzer rausgeht und es regnet, soll ihm empfohlen werden einen Regenschirm mitzunehmen.
Wenn der Nutzer rausgeht und es nicht regnet, soll ihm empfohlen werden einen Sonnenschirm mitzunehmen
Wenn der Nutzer nicht rausgeht und es regnet, soll ihm empfohlen werden die Fenster zu schließen
Wenn der Nutzer nicht rausgeht und es nicht regnet, brauch ihm nichts empfohlen werden.*/

fun main() {
    println("Gehst du heute raus? (ja/nein)")
    if (readLine() == "ja") {
        println("Regnet es? (ja/nein)")
        if (readLine() == "ja") {
            println("Nimm einen Regenschirm mit!")
        } else {
            println("Nimm einen Sonnenschirm mit!")
        }
    } else {
        println("Regnet es? (ja/nein)")
        if (readLine() == "ja") {
            println("Schließe die Fenster!")
        }
    }
}
