package KotlinInAction.chapter5._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-15 18:16
 */
fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }

    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
}