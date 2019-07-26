package KotlinInAction.chapter6._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-23 14:05
 */

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}
fun verifyUserInput1(input: String?) {
    if (input.isNullOrEmpty()) {
        println("Please fill in the required fields1")
    }
}

fun main(args: Array<String>) {
    verifyUserInput("")
    verifyUserInput(" ")
    verifyUserInput(null)
    verifyUserInput1("")
    verifyUserInput1(" ")
    verifyUserInput1(null)
}