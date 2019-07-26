package KotlinInAction.chapter6._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-23 11:23
 */

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls("22222")
    ignoreNulls(null)
}