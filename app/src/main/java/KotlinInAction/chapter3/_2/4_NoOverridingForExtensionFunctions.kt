package KotlinInAction.chapter3._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 20:27
 */
open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()
}