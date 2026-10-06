package ch02

fun main() {
//    v1()
    v2()
}

fun v1(){
    val input = readln()
    val name = if (input.isNotBlank()) input else "기본이름"
    // 기본 문자열 템플릿 사용
    print("이름은 $name")
}

fun v2() {
    val input = readln()
    val name = if (input.isNotBlank()) input else "기본이름"
    // 문자열 템플릿 중괄호 사용시 프로퍼티 접근 가능
    print("이름 길이는 ${name.length}자")
}