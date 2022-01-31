package backJoon.단어공부

fun main() {
    val map = hashMapOf<Char, Int> ()

    readln().uppercase().toCharArray().forEach { c ->
        map[c] = map[c]?.inc() ?: 0
    }

    var max = -1;
    var maxChar = 'A';
    var count = 0;

    map.forEach { (k, v) ->
        if (v > max) {
            maxChar = k;
            max = v
            count = 1;
        } else if (v == max)
            count++;
    }

    println(if(count > 1) '?' else maxChar)
}