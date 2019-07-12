package KotlinInAction.chapter2._4

import java.util.*

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 15:42
 */
fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
//        相当于Java中的 binaryReps.put(c,binary)
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for ((index,element) in list.withIndex()) {
        println("$index: $element")
    }
}