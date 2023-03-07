package lms_129

fun main(){

    val temperature = "50f"
    val unit = temperature.takeLast(1).toUpperCase()
    val value = temperature.dropLast(1).toDouble()

    val result = if (unit == "C") {
        (value * 9 / 5 + 32).toInt().toString() + "F"
    } else {
        ((value - 32) * 5 / 9).toInt().toString() + "C"
    }

    println(result)
}
