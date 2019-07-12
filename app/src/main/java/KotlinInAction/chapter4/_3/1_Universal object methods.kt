package KotlinInAction.chapter4._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-11 15:34
 */
class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name = $name, postalCode = $postalCode)"
}

/**
 * 使用data 修饰的class 自动实现了 toString()、equals()和hashCode()方法，
 * 通常情况下的class需要我们自己手动实现上述方法
 */
data class Client1(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client = Client("Alice", 342562)
    println(client)
    val client1 = Client1("Bob",12334)
    val client2 = Client1("Bob",12334)
    println(client2)
    println(client1.equals(client2))
    println(client1 == client2)
    println(client1.copy(postalCode = 22222))
}