fun main() {
    println(StarRating(readLine()))
}
fun StarRating(str: String?): String {
// code goes here
    val full = "full"
    val half = "half"
    val empty = "empty"
    if (str == null) return "$empty $empty $empty $empty $empty"
    val result: MutableList<String> = mutableListOf()
    val splitValue: List<String> = str.split("\\.".toRegex())
    val mainValue = splitValue[0].toInt()
    if (mainValue > 0) {
        for (i in 0 until mainValue) {
            result.add(full)
        }
    } else {
        for (i in 0 until 4) {
            result.add(empty)
        }
    }
    val doubleValue = "0.${splitValue[1]}".toDouble()
    if (doubleValue >= 0.1) {
        if (mainValue > 0) {
            result.add(half)
        } else {
            result.add(0, half)
        }
    } else {
        result.add(empty)
    }
    if (result.size < 5) {
        for (k in (result.size) until 5) {
            result.add(empty)
        }
    }
    var answer = ""
    for (j in 0 until 5) {
        answer += result[j]
        if (j < 4) answer += " "
    }
    return answer;
}