package KotlinInAction.chapter6._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-23 17:10
 */

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)
    printHashCode(111)
}