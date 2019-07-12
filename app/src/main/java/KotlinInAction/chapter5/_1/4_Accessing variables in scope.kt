package KotlinInAction.chapter5._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-12 13:52
 */

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors,"Error:")
}