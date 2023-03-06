package lms_129


fun main() {
    val a = 1
    val b = 5
    var result = 0

    if (a >= b) {
        result = 0
    } else {
        for (number  in a..b) {
            result += number
        }
    }

    println(result) // Output: 15
}


