package KotlinInAction.chapter2._3

import KotlinInAction.chapter2._3.Color.*

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 19:33
 */
fun mix(color1: Color, color2: Color) =
    when (setOf(color1, color2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun mixV2(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == RED) ->
            ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
                (c1 == BLUE && c2 == YELLOW) ->
            GREEN

        (c1 == BLUE && c2 == VIOLET) ||
                (c1 == VIOLET && c2 == BLUE) ->
            INDIGO

        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mix(RED, YELLOW))
    println(mixV2(BLUE, VIOLET))
}