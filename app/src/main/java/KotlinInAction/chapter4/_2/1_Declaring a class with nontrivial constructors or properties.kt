package KotlinInAction.chapter4._2

import android.content.Context
import android.util.AttributeSet

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-10 15:43
 */

class User constructor(_nickname: String) {
    var nickname: String

    init {
        nickname = _nickname
    }
}

class User1(_nickname: String) {
    val nickname = _nickname
}

class User2(val nickname: String)

class User3(
    val nickname: String,
    val isSubscribed: Boolean = true
)

open class View {
    constructor(context: Context) {

    }

    constructor(context: Context, attributes: AttributeSet) {

    }
}

class Button : View {
    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, attributes: AttributeSet) : super(context, attributes)
}

fun main(args: Array<String>) {
    val user = User("aaa")
    println(user.nickname)
    user.nickname = "222"
    println(user.nickname)

    val alice = User3("Alice")
    println(alice.isSubscribed)
    val bob = User3("Bob", false)
    println(bob.isSubscribed)
    val carol = User3("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}