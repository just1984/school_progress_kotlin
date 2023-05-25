import kotlin.math.PI

fun main(){
    val radius = readln().toDouble()
    println("Umfang: ${kreisUmfang(radius)}")
}

fun kreisUmfang(radius: Double): Double{
    val pi = kotlin.math.PI
    return 2 * PI * radius
}
