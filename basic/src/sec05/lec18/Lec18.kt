package sec05.lec18

val fruits = listOf(
    Fruit(1L, "사과", 1_000, 10_000),
    Fruit(2L, "딸기", 1_000, 20_000),
    Fruit(3L, "사과", 1_000, 25_000),
    Fruit(4L, "바나나", 1_000, 2_000),
    Fruit(5L, "메론", 1_000, 2_000),
)


fun main() {
//    filter()
//    map()
//    various()
    listToMap()
}

fun listToMap() {
    // key= 과일이름, value= List 과일
//    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val map: Map<String, List<Fruit>> = fruits.groupBy { it.name }

    for ((key, value) in map) {
        println("$key -> $value")
    }

    // id-> 과일
    val map2: Map<Long, Fruit> = fruits.associateBy { it.id }
    for ((key, value) in map2) {
        println("$key -> $value")
    }

    // key와 value 동시 처리 가능
    val map3: Map<String, List<Long>> = fruits.groupBy({ it.name }, { it.currentPrice })
    for ((key, value) in map3) {
        println("$key -> $value")
    }
}

fun various() {
    // all: 조건 모두 만족 -> true, 아니면 false
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" } // false
    // none : 조건 모두 불만족 -> true, 아니면 false
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" } // false
    // any : 조건 하나라도 만족 -> true, 아니면 false
    val isAnyApple = fruits.any { fruit -> fruit.currentPrice >= 10_000 } // true

    // count: 개수 카운트
    val fruitCount = fruits.count() // size와 동일
    // sortedBy: (오름차순) 정렬
    val fruitCount2 = fruits.sortedBy { fruit -> fruit.currentPrice }
    // sortedByDescending: (내림차순) 정렬
    val fruitDescending = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    // distinctBy: 변형된 값 기준 중복 제거
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // first: 첫번째 값 가져오기 -> 무조건 null 이어야함
    // firstOrNull: 첫번째 값 또는 null 가져옴
    println(fruits.first())
    println(fruits.firstOrNull())
    // last: 마지막 값 가져오기 위와 동일
    // lastOrNull: 마지막 값 위와 동일
    println(fruits.last())
    println(fruits.lastOrNull())
}

fun filter() {
    // filter
    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // filter 에서 인덱스가 필요한 경우
    val applesIndex = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
}

fun map() {
    // 사과 가격들 출력
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }
    println(applePrices)

    // map 에서 인덱스 필요한경우
    val applePricesIdx = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println("$idx -> $fruit")
            fruit.currentPrice
        }

    println(applePricesIdx)

    // mapping 결과가 null 이 아닌 것만 가져올때
    val values = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.name }
}
