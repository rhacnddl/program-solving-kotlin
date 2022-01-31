package backJoon.영화감독숌

fun main() {
    val target = readln().toInt()

    var cnt = 0
    var i = 666
    while (true) {
        if(is666(i)) cnt++

        if(cnt == target) break

        i++
    }

    println(i)
}

fun is666(i: Int): Boolean {
    var six = 0
    for (c in i.toString().toCharArray()) {

        if(six == 3) break

        if(c == '6') six++
        else six = 0
    }

    return six == 3
}