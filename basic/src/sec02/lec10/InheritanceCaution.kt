package sec02.lec10

import sec01.printAll

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(override val number: Int) : Base(number) {
    init {
        println("Derived Class")
    }
}

fun main() {
    val derived = Derived(10)
}