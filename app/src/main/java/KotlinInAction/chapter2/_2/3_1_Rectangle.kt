package KotlinInAction.chapter2._2

import java.util.*


/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 19:09
 */
class Rectangle1(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle1 {
    val random = Random()
    return Rectangle1(random.nextInt(),random.nextInt())
}