package KotlinInAction.chapter1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-08 17:22
 */
data class Person(val name: String,
                  val age: Int? = null)

fun main() {
    val persons = listOf(Person(name = "Alice"), Person("Bob",age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}