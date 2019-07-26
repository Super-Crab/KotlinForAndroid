package KotlinInAction.chapter7._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 14:43
 */
class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}

fun main(args: Array<String>) {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)

    println("abc" < "bac")
}