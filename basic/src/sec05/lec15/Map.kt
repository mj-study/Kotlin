package sec05.lec15

fun main() {
    val map = mutableMapOf<Int, String>()
    /*
    map.put(1, "MONDAY")
    map.put(2, "TUESDAY")
    map[key] = value
     */
    map[1] = "MONDAY"
    map[2] = "TUESDAY"

    // mapOf를 사용해 불변 map 생성 가
    mapOf(1 to "MONDAY", 2 to "TUESDAY")
}

fun useMap(map: Map<Int, String>) {
    // Java의 keyset과 동일
    for (key in map.keys) {
        println("$key -> ${map[key]}")
    }

    // Java의 entrySet과 동
    for ((key, value) in map.entries) {
        println("$key -> $value")
    }
}

