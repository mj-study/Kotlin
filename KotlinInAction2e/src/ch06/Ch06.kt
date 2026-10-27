package ch06

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val isOdd = { i: Int -> i % 2 == 0}

    // 첫 번째 구조분해가 조건 충족하는 리스트, 두 번째는 조건 불충족 리스트
    val (comeIn, stayOut) = list.partition { isOdd(it) }
    println("$comeIn, $stayOut")
}