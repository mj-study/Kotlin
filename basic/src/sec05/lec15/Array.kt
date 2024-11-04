package sec05.lec15

val array = arrayOf(1, 2, 3)

fun main() {

    // indices: 0부터 마지막 index 까지 range
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    // 배열에 값을 쉽게 넣을 수 있음
    array.plus(4)

    // withIndex: 인덱스와 값을 한 번에 가져올 수 있음
    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }
}