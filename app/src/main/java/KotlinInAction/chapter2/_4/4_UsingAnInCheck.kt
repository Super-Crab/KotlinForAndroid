package KotlinInAction.chapter2._4

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 17:38
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know…​"
}

fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('a'))
    println(isNotDigit('1'))
    println(recognize('4'))
}