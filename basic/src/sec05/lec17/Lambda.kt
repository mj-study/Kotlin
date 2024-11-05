package sec05.lec17

val fruitList: List<Fruit> = listOf(
    Fruit("사과", 1_000),
    Fruit("청송사과", 2_000),
    Fruit("아오리사과", 3_000),
    Fruit("바나나", 2_000),
    Fruit("딸기", 2_000),
    Fruit("오렌지", 2_000),
)

// 람다 만드는 방법1
// (파라미터 타입) -> 반환값 타입
val isApple: (Fruit) -> Boolean = fun(fruit): Boolean {
    return fruit.name == "사과"
}

// 람다 만드는 방법2
val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

fun main() {
    val apple = Fruit("사과", 1000)

    // 람다 호출방법1
    isApple(apple)
    // 람다 호출방법2
    isApple2.invoke(apple)

    // #3
    // 람다 작성시 람다 파라미터를 it 으로 직접 참조 가능
    filterFruits(fruitList) { it.name == "사과" }

    filterFruits(fruitList) { fruit ->
        println("사과만 받아용")
        fruit.name == "사과" // return 지시어 없이 마지막 줄에 작성된 값이 반환됨
    }
}

// #3.마지막 파라미터가 함수인 경우 호출하는 쪽에서 소괄호 밖에 람다 사용 가능
private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for (fruit in fruits) {
        if (filter.invoke(fruit)) {
            results.add(fruit)
        }
    }

    return results
}

fun closure() {
    var targetFruitName = "바나나"
    targetFruitName = "사과"
    filterFruits(fruitList) { it.name == targetFruitName }
}