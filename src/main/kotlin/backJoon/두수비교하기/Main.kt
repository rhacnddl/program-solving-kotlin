package backJoon.두수비교하기

val SYMBOL = arrayOf("==", ">", "<")

fun main() {
    val arr = readln().split(' ')

    val result = arr[0].toInt().compareTo(arr[1].toInt())

    println(if(result >= 0) SYMBOL[result] else SYMBOL[2])
}