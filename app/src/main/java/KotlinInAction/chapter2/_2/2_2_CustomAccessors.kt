package KotlinInAction.chapter2._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 19:06
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41,43)
    println(rectangle.isSquare)
}