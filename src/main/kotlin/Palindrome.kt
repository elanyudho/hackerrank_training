fun main() {
    print(isPalindrome("aba"))
}

fun isPalindrome(text: String): Boolean {

    var temp = ""

    for (i in text.length - 1 downTo 0) {
        temp = "$temp${text[i]}"
    }

    println(temp)

    return temp == text
}
