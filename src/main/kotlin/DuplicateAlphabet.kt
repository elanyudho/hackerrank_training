fun countDuplicateAlphabets(input: String): Int {
    val lowerCaseInput = input.toLowerCase()
    val charCount = mutableMapOf<Char, Int>()

    for(i in 0 until lowerCaseInput.length) {
        val char = lowerCaseInput[i]
        charCount.put(char, 1 + charCount.getOrDefault(char, 0))
    }

    var count = 0

    for (i in charCount) {
        if (i.value > 1) {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val input = readLine()!!

    val result = countDuplicateAlphabets(input)

    println(result)
}