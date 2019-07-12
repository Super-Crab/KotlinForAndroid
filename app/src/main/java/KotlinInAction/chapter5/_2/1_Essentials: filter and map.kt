package KotlinInAction.chapter5._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-12 14:08
 */

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })
    println(list)

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 })
    println(people.map { it.name })
    println(people.filter { it.age > 30 }.map { it.name })
    val maxAge = people.maxBy(Person::age)?.age
    println(maxAge)
    println(people.filter { it.age == maxAge })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers)
    println(numbers.mapValues { it.value.toUpperCase() })
    println(numbers.mapKeys { it.value })
}