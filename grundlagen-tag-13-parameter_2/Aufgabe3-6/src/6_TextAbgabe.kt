/*
die main laedt die fun printFilm und legt den parameter auf eine int fest..
es wird eine val mit namen lieblingsfilem erstellt die eine veraenderbare liste definiert vom typ string.
in der println wir die val geladen und die geladene bzw weitergebene INT dem index hinzugefuegt.

 */

fun printFilm(listenIndex: Int) {
    val lieblingsFilme: MutableList<String> = mutableListOf("Batman", "Oldboy", "ES", "Harry Potter", "Pulp Fiction" )
    println(lieblingsFilme[listenIndex])
}

fun main() {
    printFilm(1)
}