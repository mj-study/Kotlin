package sec06.lec19

import sec06.lec19.ClassA as classA
import sec06.lec19.ClassB as classB

typealias UserMap = Map<String, List<String>>

fun main() {
    // typealias 사용하며 간결하게 표현
    val userRoles: UserMap = mapOf(
        "Alice" to listOf("Admin", "User"),
        "Bob" to listOf("User")
    )

    // as import 사용하여 이름 충돌 피함
    val classA = classA()
    val classB = classB()

    classA.test()
    classB.test()

    // 구조 분해
    val galaxy = Phone("갤럭시", 1_250_000)
    val (model, price) = galaxy
    println("모델: ${model} 가격: ${price}")

    val iPhone = Phone("아이폰14", price = 1_350_000)
    val (model2, price2) = iPhone
    println("모델: ${model2} 가격: ${price2}")

    val snack = Snack("홈런볼", 2_000)
    val (name, snackPrice) = snack
    println("과자: ${name} 가격:${snackPrice}")
}

data class Phone(
    val model: String,
    val price: Long
)

// 일반 클래스에서 componentN 함수 정의
class Snack(
    val name: String,
    private val price: Int
) {
    operator fun component1() = name
    operator fun component2() = price
}

fun jumpAndLabel() {
    // continue 도 사용법 동일
    out1@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) break@out1
            println("$i $j")
        }
    }
}

fun takeIfAndUnless() {
    val number = 10
    val result = number.takeIf { it > 5 }
    println(result) // 출력: 10 (조건이 참이므로 number를 반환)

    val number2 = 10
    val result2 = number2.takeUnless { it > 5 }
    println(result2) // 출력: null (조건이 참이므로 null 반환)
}