fun FirstFactorial(num: Int): Int {

    var result = num
    // code goes here
    for (i in num - 1 downTo 1) {
        result *= i
    }
    return result

}

fun main() {
    println(FirstFactorial(readLine().toString().toInt()))
}