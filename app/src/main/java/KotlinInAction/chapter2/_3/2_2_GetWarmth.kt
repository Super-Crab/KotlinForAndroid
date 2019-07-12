package KotlinInAction.chapter2._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 19:22
 */
import KotlinInAction.chapter2._3.Color.*

fun getWarmth1(color3: Color) = when(color3) {
    Color.RED,Color.ORANGE,Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE,Color.INDIGO,Color.VIOLET -> "cold"
}

fun getWarmth2(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth1(Color.INDIGO))
    println(getWarmth2(INDIGO))
}