package KotlinInAction.chapter7._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 11:22
 */
fun main(args: Array<String>) {
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}