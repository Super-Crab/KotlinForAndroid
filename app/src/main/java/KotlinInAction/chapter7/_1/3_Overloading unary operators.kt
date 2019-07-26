package KotlinInAction.chapter7._1

import java.math.BigDecimal

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 11:25
 */

/**
 * operate 也可以重载 一元操作符
 *  +a --> unaryPlus
 *  -a --> unaryMinus
 *  !a --> not
 *  ++a,a++ --> inc
 *  --a,a-- --> dec
 */

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(-p)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}