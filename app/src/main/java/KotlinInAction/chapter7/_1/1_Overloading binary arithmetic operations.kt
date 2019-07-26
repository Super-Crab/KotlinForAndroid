package KotlinInAction.chapter7._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 10:03
 */

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

/**
 *  使用operator代表重载操作符
 *
 *  * --> times
 *  / --> div
 *  % --> mod
 *  + --> plus
 *  - --> minus
 */

/**
 * shl --> 带符号左移
 * shr --> 带符号右移
 * ushr --> 无符号右移
 * and --> 与
 * or --> 或
 *
 */

fun main(args: Array<String>) {
    var p1 = Point(10, 20)
    var p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 - p2)
    println(p1 * 1.5)
    p1 += Point(3, 4)
    println(p1)
    println('a' * 3)

    println(0x0F and 0xF0)
    println(0x0F or 0xF0)
    println(0x1 shl 4)
    println(0x1 shr 1)
}