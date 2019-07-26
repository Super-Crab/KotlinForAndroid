package KotlinInAction.chapter6._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-24 14:22
 */
fun foo(l: Long) = println(l)

fun main(args: Array<String>) {
    val x = 1
    println(x.toLong() in listOf(1L, 2L, 3L))

    val b: Byte = 1
    val l = b + 1L
    foo(42)

    println("42".toInt())
}