package KotlinInAction.chapter3._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 19:10
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 'a',6)
    println(list.lastIndex)
    println(list[1].javaClass)
    println(list[2].javaClass)
}