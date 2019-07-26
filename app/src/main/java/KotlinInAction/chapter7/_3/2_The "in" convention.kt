package KotlinInAction.chapter7._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 15:05
 */
data class Point(val x: Int, val y: Int)

data class Reactangle(val upperLeft: Point, val lowerRight: Point)

operator fun Reactangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

fun main(args: Array<String>) {
    val rect = Reactangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)

    val n = 9
    println(0..(n + 1))
    (0..n).forEach { print(it) }
}