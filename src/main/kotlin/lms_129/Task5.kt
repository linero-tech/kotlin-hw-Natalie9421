package lms_129

fun main() {
    val sentence = "i love gbg"
    var count = 0

    for (char in sentence) {
        if (char in sentence) {
            count++
        }
    }

    println("The sentence '$sentence' has $count characters.")
}