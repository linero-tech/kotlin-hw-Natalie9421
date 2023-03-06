package lms_129

fun main() {
    var result = 0
    for (i in 1..1000) {
        if (i % 9 == 0) {
            result = i
        }
    }
    println("The sum of all integers between 1 and 1000 which are divisible by 9 is: $result")
}
