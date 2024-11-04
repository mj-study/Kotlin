package sec03.lec06

fun main() {
    val sb = StringBuilder()
    forEach(sb)
    originFor(sb)
    whileExam()
}

fun forEach(sb: StringBuilder) {
    val numbers = listOf(1, 2, 3, 4, 5)
    for (num in numbers) {
        sb.append(num).append(' ')
    }
    println(sb)
    sb.clear()
}

fun originFor(sb: StringBuilder) {
    for (i in 1..<3) {
        sb.append(i).append(' ')
    }
    println(sb)
    sb.clear()

    // 역순
    for (i in 3 downTo 1) {
        sb.append(i).append(' ')
    }
    println(sb)
    sb.clear()

    // 간격 설정 +2
    for (i in 1..<10 step 2) {
        sb.append(i).append(' ')
    }
    println(sb)
}

fun whileExam() {
    var count = 5
    while (count > 0) {
        println(count)
        count--
    }
}