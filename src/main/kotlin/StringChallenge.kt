fun StringChallenge(str: String): String {

    // code goes here
    var result = ""
    for (i in str.indices){
        val character =
            when {
                i == 0 -> {
                    str[i].toUpperCase()
                }

                i != 0 && !str[i].isWhitespace() && str[i - 1].isWhitespace() && str[i].isLetter() -> {
                    str[i].toUpperCase()
                }
                else -> ""
                
            }

        result += character
    }
    return result

}

fun main() {
    println(readLine()?.let { StringChallenge(it) })
}