package lms_129

fun main() {
    val number = 678
    var result = 0
    var n = number
    while (n > 0) {
        val digit = n % 10
        result = result * 10 + digit
        n /= 10
    }
    println(result)

}
