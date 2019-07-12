package KotlinInAction.chapter3._5

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-10 13:39
 */
val kotlinLogo = """| //
                    .|//
                    .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
}