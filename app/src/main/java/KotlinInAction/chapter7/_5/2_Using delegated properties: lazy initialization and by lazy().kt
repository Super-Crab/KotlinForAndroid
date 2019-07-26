package KotlinInAction.chapter7._5

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-25 15:53
 */
class Email{}

class Person(val name: String) {
    private var _emails: List<Email>? = null

    val email by lazy { loadEmailv2(this) }

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            println("has be load")
            return _emails!!
        }
}

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

fun loadEmailv2(person: Person): List<Email> {
    println("Load emails V2 for ${person.name}")
    return listOf(/*...*/)
}

fun main(args: Array<String>) {
    val p = Person("Alice")
    p.emails
    p.emails
    p.email
    p.email
}