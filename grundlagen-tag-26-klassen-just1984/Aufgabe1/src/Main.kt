fun main() {

    var firstBus: Bus = Bus()
    var secondBus: Bus = Bus()
    var thirdBus: Bus = Bus()
    firstBus.durchsage()

    firstBus.honk()

    val ps = firstBus.horsePower
    println("Ganze $ps PS hat unser Bus.")

    firstBus.horsePower = 750
    var newPs = firstBus.horsePower
    println("Jetzt hat unser Bus sogar $newPs PS!")

    val seatCount = firstBus.seats
    println("Unser Bus hat $seatCount Sitze.")

    println("PS des zweiten Busses: ${secondBus.horsePower}")
    println("PS des dritten Busses: ${thirdBus.horsePower}")

}