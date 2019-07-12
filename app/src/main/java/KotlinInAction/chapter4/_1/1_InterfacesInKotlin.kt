package KotlinInAction.chapter4._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-10 14:14
 */

/**
 * 1.使用冒号替代Java中的关键字extends 和implements，使用override替代Java中的@Override
 * 2.接口中方法可以提供一个默认的实现
 * 3.如果实现的两个接口中有一个共同的方法，必须实现这个方法，否则会编译出错
 * 4.当一个类被open修饰时，这个类才可以被继承。当类中的方法修饰为open时，这个方法才可以被重新
 * 5.当一个override方法被final修饰，那么这个方法就不能被子类重写
 * 6.当一个抽象类中存在abstract方法，这个方法默认是open的,必须被重写，不需要再使用open去修饰
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

open class RichButton : Clickable {
    override fun click() {

    }
//当一个override方法被final修饰，那么这个方法就不能被子类重写
    final override fun showOff() {
        super.showOff()
    }

    fun disable() {}

    open fun animate() {}
}

class RichButton1 : RichButton() {
    override fun click() {
        super.click()
    }

    override fun animate() {
        super.animate()
    }
}

class Button : Clickable, Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun click() = println("I was clicked")
}

abstract class Animated {
    abstract fun animate()

    open fun stopAnimating() {

    }

    fun animateTwice() {

    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}