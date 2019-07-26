package KotlinInAction.chapter6._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-24 14:19
 */
data class Person2(val name: String, val age: Int? = null) {

    fun isOlderThan(other: Person2): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main(args: Array<String>) {
    println(Person2("Sam", 35).isOlderThan(Person2("Amy", 42)))
    println(Person2("Sam", 35).isOlderThan(Person2("Jane")))
}