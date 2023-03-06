package lms_129

fun main() {
    
    val number = 19
    var result = true
    if (number <= 1) {
        result = false
    } else {
        for (i in 2 until number) {
            if (number % i == 0) {
                result = false
            }
        }
    }
    println(result)


}
