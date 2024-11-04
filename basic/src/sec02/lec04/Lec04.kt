package sec02.lec04

import sec02.Money

fun main() {
    val money1 = Money(1_000L)
    val money2 = money1
    val money3 = Money(1_000L)

    println(money1 === money2) // true
    println(money1 === money3) // false
}