package backJoon.단어의개수

fun main() {
    val str = readln().trim()
    if(str != "") println(str.split(" ").size) else println(0)
}