package KotlinInAction

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-05 10:42
 */
fun main() {
    var count: Int = 10
    count = 15
    val language: String? = "Kotlin"
    println(language)
    val upperCaseName = language?.toUpperCase()
    println(upperCaseName)
    if (count == 42) {
        println("I have the answer.")
    } else if (count > 35) {
        println("The answer is close.")
    } else {
        println("The answer eludes me.")
    }

    var answerString: String = if (count == 42) {
        "I have the answer."
    } else if (count > 35) {
        "The answer is close."
    } else {
        "The answer eludes me."
    }
    println(answerString)
    count = 41
    answerString = when {
        count == 42 -> "I have the answer."
        count > 35 -> "The answer is close."
        else -> "The answer eludes me."
    }
    println(answerString)
    println(generateAnswerString(42))
    println(generateAnswerString1(3))


    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }
    println(stringLengthFunc("Android"))
}

fun generateAnswerString(countThreshold: Int?): String {
    val answerString = if (countThreshold == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }
    return answerString
}

fun generateAnswerString1(countThreshold: Int?): String = if (countThreshold == 42) {
    "I have the answer"
} else {
    "The answer eludes me"
}