package KotlinInAction.chapter7._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 14:32
 */

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return other.x == x && other.y == y
    }
}

fun main(args: Array<String>) {
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
    println(null == Point(1, 2))
}