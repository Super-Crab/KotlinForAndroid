package KotlinInAction.chapter2._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 18:57
 */
class Person1(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person1("Bob", true)
    println(person.name)
    println(person.isMarried)
}