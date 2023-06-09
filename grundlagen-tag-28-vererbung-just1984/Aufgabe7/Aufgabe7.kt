open class Vogel(open val gewicht: Double) {
    open val canFly: Boolean = false

    fun makeNoise() {
        println("Animal noises.")
    }
}

class Pinguin(override val gewicht: Double) : Vogel(gewicht) {
    override val canFly = false

    fun watscheln() {
        println("Der Pinguin watschelt.")
    }
}

class Adler(override val gewicht: Double) : Vogel(gewicht) {
    override val canFly = true

    fun fliegen() {
        println("Der Adler fliegt.")
    }
}

class Taube(override val gewicht: Double) : Vogel(gewicht) {
    override val canFly = true

    fun gurren() {
        println("Die Taube gurrt.")
    }
}

fun main() {
    val adler = Adler(5.0)
    println("Kann der Adler fliegen? ${adler.canFly}")
    adler.makeNoise()
    adler.fliegen()

    val pinguin = Pinguin(10.0)
    println("Kann der Pinguin fliegen? ${pinguin.canFly}")
    pinguin.makeNoise()
    pinguin.watscheln()

    val taube = Taube(1.0) // Bonus Vogel
    println("Kann die Taube fliegen? ${taube.canFly}")
    taube.makeNoise()
    taube.gurren()
}
