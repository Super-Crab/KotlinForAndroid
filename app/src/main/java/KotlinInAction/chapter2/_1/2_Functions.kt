package KotlinInAction.chapter2._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 17:49
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main(args: Array<String>) {
    print(max(1, 2))
}