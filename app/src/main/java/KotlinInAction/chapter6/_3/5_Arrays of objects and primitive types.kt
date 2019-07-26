package KotlinInAction.chapter6._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 09:46
 */

fun main(args: Array<String>) {
    val letters = Array<String>(28) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))

    val strings = listOf("a", "b", "c")
    println("%s%s%s".format(*strings.toTypedArray()))

    val squares = IntArray(5) { i -> (i+1) * (i+1)}
    println(squares.joinToString())
}