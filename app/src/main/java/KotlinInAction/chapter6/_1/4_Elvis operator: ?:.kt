package KotlinInAction.chapter6._1

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-23 10:35
 */

/**
 *  ?: 提供默认值，如果为空，则选后面的值
 */

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with (address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    println(strLenSafe(null))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)
    printShippingLabel(person)
    printShippingLabel(Person("Alexey", null))
}