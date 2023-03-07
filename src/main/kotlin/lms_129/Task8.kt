package lms_129

fun main(){

    val number = 1234
    var result = 0
    for (char in number.toString()) {
        result = result + char.toString().toInt()
    }
    println(result)
}
