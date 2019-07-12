package KotlinInAction.chapter2._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 18:53
 */
fun main(args: Array<String>) {
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}