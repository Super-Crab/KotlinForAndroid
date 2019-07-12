package KotlinInAction.chapter4._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-11 15:03
 */
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}