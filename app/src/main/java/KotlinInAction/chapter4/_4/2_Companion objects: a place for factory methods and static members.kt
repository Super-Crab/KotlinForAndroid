package KotlinInAction.chapter4._4

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-12 09:53
 */
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }

    fun bar1() {
        println("Companion object called1")
    }
}

fun main(args: Array<String>) {
    A.bar()
}