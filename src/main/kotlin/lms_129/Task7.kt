package lms_129

fun main() {
    val a = 1
    val b = 3
    var result = 1
    if (a == 0 && b == 0) {
        result = 1
    } else {
        for (i in 1..b) {
            result = result * a
        }
    }
    println(result)
}
