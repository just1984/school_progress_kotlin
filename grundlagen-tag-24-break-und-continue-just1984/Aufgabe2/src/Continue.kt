fun main() {
    val numbers: List<Int> = listOf(34, 42, 235, 42, 42, 24, 42, 42, 7346, 34)
    for (number in numbers) {
        if (number == 42) {
            continue
        }
        println(number)
    }
}
