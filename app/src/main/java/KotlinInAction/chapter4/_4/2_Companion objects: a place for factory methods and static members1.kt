package KotlinInAction.chapter4._4

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-12 09:59
 */

fun getFacebookName(accountId: Int) = "fb:$accountId"

class User {
    val nickname: String

    constructor(nickname: String) {
        this.nickname = nickname.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}

class User1 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User1(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User1(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User1.newSubscribingUser("bob@gmail.com")
    val facebookUser = User1.newFacebookUser(4)
    println(subscribingUser.nickname)
}