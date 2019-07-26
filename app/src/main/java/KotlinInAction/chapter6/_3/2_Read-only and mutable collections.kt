package KotlinInAction.chapter6._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-24 14:46
 */

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun main(args: Array<String>) {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1, 2, 3)
    copyElements(source, target)
    println(target)
}