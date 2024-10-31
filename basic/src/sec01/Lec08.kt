package sec01

fun main() {
    repeat("아파트")
    repeat("아파트", 5)
    repeat("아파트", 5, false)
    repeat("아파트", useNewLine = false)

    printNameAndGender(name = "한강", gender = "MALE")

    printAll("A", "B", "C") // Java와 동일
    val array = arrayOf("A", "B", "C")
    printAll(*array) // spread 연산, 배열을 넣을경우에는 *을 넣어야함
}

/**
 * 함수가 하나의 결과값이면 block 대신 = 사용 가능
 * 타입 추론이 가능하기때문에 반환값 명시 안해도 가능
 */
fun max(a: Int, b: Int) = if (a > b) a else b

/**
 * #2 default parameter 사용
 */
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

/**
 * #3 named argument
 */
fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

/**
 * #4 가변인자
 * 가변인자를 사용할때는 vararg 키워드를 사용해ㅑㅇ함
 */
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}