package KotlinInAction.chapter3._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 19:59
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {

    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> Collection<T>.joinToString1(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index,element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString1(separator, prefix, postfix)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 'a')
    println(joinToString(list, "; ", "(", ")"))
    println(joinToString(list, prefix = "$", postfix = "."))

    println(list.joinToString1(" "))

    println(listOf("1", "2", "3").join(" "))
}