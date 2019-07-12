package KotlinInAction.chapter2._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 17:51
 */
fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    print("Hello, $name")
}