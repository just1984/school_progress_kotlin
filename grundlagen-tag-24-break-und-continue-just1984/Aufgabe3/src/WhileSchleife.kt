/*fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)
    println(numbers)
    var i = 0
    while (i < numbers.size) {
        numbers[i] = numbers[i] * 3
        i++
    }
    println(numbers)
}*/

fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)
    println(numbers)
    val multiplizierteNumbers = blablabla(numbers, 3.0)
    println(multiplizierteNumbers)
}

fun blablabla(list: MutableList<Double>, multipliziere: Double): MutableList<Double> {
    var i = 0
    while (i < list.size) {
        list[i] = list[i] * multipliziere
        i++
    }
    return list
}