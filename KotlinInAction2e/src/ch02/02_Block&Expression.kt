package ch02

fun main() {
    val a = 3
    val b = 6
    println(blockFn(a, b))
    println(expressionFn(a, b))
}

// 블록(block)에서는 반환 타입 생략 불가능
fun blockFn(a: Int, b: Int): Int {
    return a + b
}

// 식(expression)에서는 반환 타입 생략 가능
fun expressionFn(a: Int, b: Int) = a + b