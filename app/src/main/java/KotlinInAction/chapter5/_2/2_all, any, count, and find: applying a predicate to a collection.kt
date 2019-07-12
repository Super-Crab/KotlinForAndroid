package KotlinInAction.chapter5._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-12 15:02
 */

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val person = listOf(Person("Alice", 27), Person("Bob", 31))
    println(person.all(canBeInClub27))
    println(person.any(canBeInClub27))
    println(person.count(canBeInClub27))
}