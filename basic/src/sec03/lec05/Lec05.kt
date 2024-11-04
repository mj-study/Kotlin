package sec03.lec05

fun main() {
    startsWithA(10)
    println(startsWithA("Apple"))
    println(startsWithA(10L))

    multiValuesWithWhen(1)
    multiValuesWithWhen(2)

    println(isEven(2))
    println(isEven(3))
}

/**
 * if문 바로 return 가능 -> Expression
 */
fun convertToScore(score: Int): String {
    return if (score in 90..100) {
        "A"
    } else if (score in 80..89) {
        "B"
    } else {
        "F"
    }
}

/**
 * Kotlin -> switch X, when 사용
 * when (조건){
 *   조건부 -> 값
 * }
 */
fun convertToScore2(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        else -> "F"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is Int -> {
            println("들어온 값 ${obj}")
            return false
        }

        is String -> obj.startsWith("A")
        else -> false
    }
}

fun multiValuesWithWhen(number: Int) {
    when (number) {
        1, 0, -1 -> println("1, 0, -1 중 하나입니다 $number")
        else -> println("그 외의 값입니다 $number")
    }
}

fun isEven(number: Int): Boolean {
    return when {
        number % 2 == 0 -> true
        else -> false
    }
}