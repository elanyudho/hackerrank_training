fun getFibonacci(n: Int): Array<Int> {
    val arr = arrayListOf<Int>()

            var value1 = 0
            var value2 = 1

            for (i in 1..n) {
                arr.add(value1)
                val sum = value1 + value2
                value1 = value2
                value2 = sum
            }

    return arr.toTypedArray()

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = getFibonacci(n)

    println(result.joinToString("\n"))
}