package sec02.lec15

// 타입 추론이 가능하여 생략 가
val numbers = listOf(1, 2, 3)

// 빈 리스트를 만들때는 타입을 명시해주어야함
val emptyList = emptyList<Int>()

val mutableList = mutableListOf(1, 2, 3)

fun main() {
    // 함수의 파라미터에서 타입을 명시했기에, 호출시 타입 추론하여 타입 생략이 가능
    useNumbers(emptyList())

    // 리스트 인덱스 접근
    println(numbers[0]) // numbers.get(0) 도 가능하지만, 배열처럼 접근 권장

    for (num in numbers) {
        println(num)
    }

    for ((idx, number) in numbers.withIndex()) {
        println("$idx: $number")
    }

    // 가변리스트 값 추가
    mutableList.add(4)
}

private fun useNumbers(numbers: List<Int>) {

}

// 컬렉션 null 가능성
fun nullableCollection() {
    // 리스트에 null 들어갈 수 있지만, 리스트는 절대 null 이 아님
    val nullableElementNotNullList: List<Int?> = listOf(1, 2, 3, null)

    // 리스트에 null 들어갈 수 없지만, 리스트는 null 일 수 있음
    val notNullElementNullableList: List<Int>? = null

    // 리스트에 null이 들어갈 수 있고, 리스트가 null일 수도 있음
    val nullableElementAndList: List<Int?>? = null
}