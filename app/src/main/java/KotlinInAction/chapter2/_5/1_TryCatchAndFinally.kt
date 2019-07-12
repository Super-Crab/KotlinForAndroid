package KotlinInAction.chapter2._5

import java.io.BufferedReader
import java.io.StringReader

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 18:56
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}
fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
