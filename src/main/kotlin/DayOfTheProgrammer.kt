/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

//link test: https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true
fun dayOfProgrammer(year: Int): String {
    // Write your code here
    var february = 28
    return when {

        year > 1918 -> {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                february = 29
            }
            "${sumDay(february)}.09.$year"
        }

        year == 1918 -> {
            "26.09.1918"
        }

        else -> {
            if (year % 4 == 0) {
                february = 29
            }
            "${sumDay(february)}.09.$year"
        }

    }
}

fun sumDay(february: Int): Int {
    val sumDay = 31 + february + 31 + 30 + 31 + 30 + 31 + 31
    return 256 - sumDay
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
