package ch02

fun main() {
//    for (i in 1..100) {
//        println(fizzBuzz(i))
//    }

    for( i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    val list = listOf("a", "b", "c")
    list.withIndex()
}

fun fizzBuzz(n: Int) = when {
    n % 15 == 0 -> "피즈버즈"
    n % 3 == 0 -> "피즈"
    n % 5 == 0 -> "버즈"
    else -> "$n "
}