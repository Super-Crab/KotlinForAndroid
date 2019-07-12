package KotlinInAction.chapter2._3

/**
 * Description:
 * Author:          peixuan.xie
 * Time:            2019-07-09 13:40
 */
interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) :
    Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval1(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval1(e.left) + eval1(e.right)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun eval2(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
//            e.left + e.right
            eval2(e.right) + eval2(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(
        eval(
            Sum(
                Sum(
                    Num(
                        1
                    ), Num(2)
                ), Num(4)
            )
        )
    )
    println(
        eval1(
            Sum(
                Num(1),
                Num(2)
            )
        )
    )
    println(
        eval2(
            Sum(
                Num(1),
                Num(2)
            )
        )
    )
}