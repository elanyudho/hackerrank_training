fun FirstReverse(str: String): String {

    // code goes here
    var reverse = ""

    for(i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
    return reverse;

}

fun main() {
    println(readLine()?.let { FirstReverse(it) })
}