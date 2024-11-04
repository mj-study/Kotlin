package sec05.lec16

fun main() {
    3.add(5) // 일반 함수
    3 add2 4 // infix 함수
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}