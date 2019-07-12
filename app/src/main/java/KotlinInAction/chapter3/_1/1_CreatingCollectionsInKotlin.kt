package KotlinInAction.chapter3._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 19:01
 */

val set = hashSetOf(1, 7, 'a')
val list = arrayListOf(1, 7, 'a')
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    println(set)
    println(list)
    println(map)

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())
    val numbers = setOf(1, 14, 2)
    println(numbers.max())
}

