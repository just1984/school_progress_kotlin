class Airplane(val amountTurbines: Int, val flyingSpeed: Int) {
    var isAirborne = false

    fun takeOff() {
        if (!isAirborne) {
            isAirborne = true
            println("Das Flugzeug ist abgehoben!")
        } else {
            println("Das Flugzeug ist bereits in der Luft!")
        }
    }

    fun land() {
        if (isAirborne) {
            isAirborne = false
            println("Das Flugzeug ist gelandet!")
        } else {
            println("Das Flugzeug befindet sich bereits am Boden!")
        }
    }
}

fun main() {
    val airplane = Airplane(4, 900)
    airplane.takeOff()
    airplane.land()
}