import java.util.*

object NthPrime {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n to compute the nth prime number: ")
        val nth = sc.nextInt()
        var num: Int
        var count: Int
        var i: Int
        num = 1
        count = 0
        while (count < nth) {
            num = num + 1
            i = 2
            while (i <= num) {
                //Here we will loop from 2 to num
                if (num % i == 0) {
                    break
                }
                i++
            }
            if (i == num) { //if it is a prime number
                count = count + 1
            }
        }
        println("Value of nth prime: $num")
    }
}