package KotlinInAction.chapter6._2

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-24 09:02
 */

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}

fun main(args: Array<String>) {
    showProgress(146)
}