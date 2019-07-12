package KotlinInAction.chapter3._5

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-10 11:10
 */
fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".","-"))
}