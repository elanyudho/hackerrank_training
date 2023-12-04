import java.util.*

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val fcToMouse = if (x - z < 0) {(x - z) * -1} else {(x - z)}
    val scToMouse = if (y - z < 0) {(y - z) * -1} else {(y - z)}
    return when {
        fcToMouse == scToMouse -> "Mouse C"
        fcToMouse > scToMouse -> "Cat B"
        else -> "Cat A"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
