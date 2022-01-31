package backJoon.AandB

fun main() {
    val arr = readln().split(' ').map { s:String -> s.toDouble() }
    println(arr[0] / arr[1])
}