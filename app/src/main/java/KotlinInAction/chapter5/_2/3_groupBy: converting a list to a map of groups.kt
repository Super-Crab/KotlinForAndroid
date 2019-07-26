package KotlinInAction.chapter5._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-15 16:10
 */

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people.groupBy { it.age })
    println(people.groupBy { it.age }.keys)
    println(people.groupBy { it.age }.values)

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}