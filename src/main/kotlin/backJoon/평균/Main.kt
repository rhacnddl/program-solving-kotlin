package backJoon.평균

import java.util.*

fun main() {
    val cnt = readln().toInt()

    val scores = readln().split(' ').map { score -> score.toDouble()}.toMutableList()

    val max = Collections.max(scores)

    println(scores.sumOf { score -> score / max * 100.0 } / cnt)
}