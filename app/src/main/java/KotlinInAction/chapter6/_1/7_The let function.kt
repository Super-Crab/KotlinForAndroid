package KotlinInAction.chapter6._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-23 11:33
 */

/**
 *  let 操作符可用于处理对象为空的情况，当不为null时，调用let里的代码段
 */

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }
}