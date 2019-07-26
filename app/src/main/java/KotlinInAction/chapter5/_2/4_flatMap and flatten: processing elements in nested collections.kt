package KotlinInAction.chapter5._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-15 16:18
 */
class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings)
    println(strings.toList())
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett",
            "Neil Gaiman")))
    println(books.flatMap { it.authors })
    println(books.flatMap { it.authors }.toSet())
}