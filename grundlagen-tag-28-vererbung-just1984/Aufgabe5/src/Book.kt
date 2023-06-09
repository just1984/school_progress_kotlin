class Book(val pages: List<Page>) {
    var currentPage: Page = pages[0]

    fun read() {
        currentPage.read()
    }

    fun nextPage() {
        val nextPageIndex = pages.indexOf(currentPage) + 1
        if (nextPageIndex < pages.size) {
            currentPage = pages[nextPageIndex]
            println("Seite gewechselt. Aktuelle Seite ist ${nextPageIndex + 1}.")
        } else {
            println("Sie sind bereits auf der letzten Seite.")
        }
    }

    fun previousPage() {
        val previousPageIndex = pages.indexOf(currentPage) - 1
        if (previousPageIndex >= 0) {
            currentPage = pages[previousPageIndex]
            println("Seite gewechselt. Aktuelle Seite ist ${previousPageIndex + 1}.")
        } else {
            println("Sie sind bereits auf der ersten Seite.")
        }
    }
}
