fun stringPeriods(str: String): String {

    // code goes here
        if (str.length == 1) {
            return "-1"
        }

        var subString = ""
        var result = ""
        var current = 0
        var isValid = true

        while (current < str.length/2) {
            subString += str[current]


            var i = current + 1
            while (i < str.length) {
                if (subString != str.substring(i, subString.length)) {
                    isValid = false
                    break
                }
                i += subString.length
            }

            if (isValid && subString.length > result.length ) {
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
            println("woi")
            "-1"
        }
}

fun main() {
    println(stringPeriods(readLine().toString()))
}