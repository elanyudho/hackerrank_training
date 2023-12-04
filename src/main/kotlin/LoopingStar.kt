fun main() {
    loopingStar()
}

fun loopingStar() {
    for(i in 1..5) {
        for (y in 1..i) {
            print("*")
        }
        println()
    }
}