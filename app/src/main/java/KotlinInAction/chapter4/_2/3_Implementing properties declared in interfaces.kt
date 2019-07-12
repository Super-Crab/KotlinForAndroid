package KotlinInAction.chapter4._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-10 16:22
 */

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface UserI {
    val nickname: String
}

class PrivateUser(override val nickname: String) : UserI

class SubscribingUser(val email: String) : UserI {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : UserI {
    override val nickname = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
    println(FacebookUser(1111).nickname)
}