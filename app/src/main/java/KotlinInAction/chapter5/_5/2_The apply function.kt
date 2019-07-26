package KotlinInAction.chapter5._5

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-22 15:43
 */

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main(args: Array<String>) {
    println(alphabetApply())
}