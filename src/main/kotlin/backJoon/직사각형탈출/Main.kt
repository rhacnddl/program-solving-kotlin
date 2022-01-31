package backJoon.직사각형탈출

import java.util.*

val Y = arrayOf(-1, 1, 0, 0)
val X = arrayOf(0, 0, -1, 1)

val CHECK = Array(1001) { Array(1001) { false } }

class Point(
    val y: Int,
    val x: Int,
    val move:Int) {

    fun visit() {
        CHECK[y][x] = true
    }
}

fun BFS(x:Int, y:Int, w:Int, h:Int):Int {

    var result = 0
    val Q = LinkedList<Point> ()

    val initPoint = Point(y, x, 0)
    initPoint.visit()

    Q.add(initPoint)

    while (!Q.isEmpty()) {
        val p = Q.poll()

        if (p.y == h || p.x == w || p.y == 0 || p.x == 0) {
            result = p.move
            break;
        }

        for (a in 0..3) {
            val ny = p.y - Y[a]
            val nx = p.x - X[a]

            if(ny > h || nx > w || ny < 0 || nx < 0 || CHECK[ny][nx]) continue

            val np = Point(ny, nx, p.move.inc())
            np.visit()
            Q.add(np)
        }
    }

    return result
}

fun main() {
    val points = readln().split(' ').map { point -> point.toInt() }

    val x = points[0]
    val y = points[1]
    val w = points[2]
    val h = points[3]

    println(BFS(x, y, w, h))
}