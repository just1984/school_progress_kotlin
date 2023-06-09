fun main() {
    val pages = listOf(
        Page("Das ist der Anfang des Buches."),
        Page("Jetzt sind wir auf Seite 2."),
        Page("Hier haben wir gerade Seite 3 erreicht."),
        Page("Nun sind wir bei der letzten Seite angekommen.")
    )

    val book = Book(pages)

    // Lesen Sie das Buch von vorne nach hinten.
    for (i in pages.indices) {
        book.read()
        book.nextPage()
    }

    // Lesen Sie das Buch von hinten nach vorne.
    for (i in pages.indices.reversed()) {
        book.previousPage()
        book.read()
    }
}
