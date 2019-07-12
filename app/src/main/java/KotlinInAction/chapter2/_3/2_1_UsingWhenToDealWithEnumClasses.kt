package KotlinInAction.chapter2._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 19:20
 */

fun getMnemonic(color2: Color) =
    when (color2) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
}