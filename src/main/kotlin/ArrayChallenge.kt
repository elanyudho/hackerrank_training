import java.util.*


fun stringPeriods(strArr: Array<String>): String {

    val numbers = ArrayList<Int>()
    var result = ""
    var moreThanAnElement = false

    for (i in strArr.indices) {
        if (strArr[i].equals("E")) {
            numbers.sort()
            if (moreThanAnElement) {
                result += ","
            }
            result += numbers[0].toString()
            numbers.removeAt(0)
            moreThanAnElement = true
        } else {
            numbers.add(strArr[i].toInt())
        }
    }

    return result
  /*  if (str.length == 1) {
        return "-1"
    }

    var subString = ""
    var result = ""
    var current = 0

    while (current < str.length/2) {
        var isValid = true
        subString += str[current]

        for (i in current + 1..subString.length) {
            if (subString != str.substring(i, subString.length)) {
                isValid = false
                break
            }
        }

        if (isValid && subString.length> result.length ) {
            result = subString
        }

        current++

    }

    return if (result.length >= 1)
    {
        result
    }
    else
    {
        "-1"
    }*/
}

fun main() {
    println(stringPeriods(arrayOf("1","2","E","E","3")))
}
