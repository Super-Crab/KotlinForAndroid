package KotlinInAction.chapter5._5

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-18 14:37
 */

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
       result.append(letter)
    }
    result.append("\n Now I know the alphaber!")
    return result.toString()
}

fun alphabetWith(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\n Now I know the alphabet!")
        this.toString()
    }
}

fun alphabetWith02() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know the alphabet!")
    toString()
}

fun main(args: Array<String>) {
    println(alphabet())
    println(alphabetWith())
    println(alphabetWith02())
}