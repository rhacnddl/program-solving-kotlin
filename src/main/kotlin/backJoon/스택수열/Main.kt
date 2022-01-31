package backJoon.스택수열

import java.util.*
import kotlin.collections.ArrayList

val NO = "NO"
val stack = Stack<Int>()
val result = ArrayList<Char>()

fun main() {

    val n = readln().toInt()
    val arr = IntArray (n)
    var k = 0

    for (i in 1..n) {
        arr[i-1] = readln().toInt()

        push(i)

        while (!stack.isEmpty() && stack.peek() == arr[k]) {
            pop()
            k++
        }
    }

    if(stack.isEmpty())
        result.forEach { println(it) }
    else
        println(NO)
}

fun push(i:Int) {
    stack.push(i)
    result.add('+')
}

fun pop(): Int {
    result.add('-')
    return stack.pop()
}