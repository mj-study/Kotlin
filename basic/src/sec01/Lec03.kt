package sec01

fun main() {
    // 명시적으로 타입 변환해주어야함 (Java 와 다름!)
    val num1 = 3
    val num2: Long = num1.toLong()

    val num3 = null
    val num4: Long? = num3?.toLong()

    convertPersonIsNull(4)
    convertPersonIsNull(Person("한강"))

    // String interpolation
    val person = Person("나미")
    println("이름 : ${person.name}")

    val withOutIndent =
        """
            가나다
            라마바
            사아
        """.trimIndent()
    println(withOutIndent)
}

fun convertPerson(obj: Any) {
//    if (obj is Person) { => is Type == Java의 instance of Type
//        val person = obj as Person => Java (Person) variable
//        println(person.name)
//    }

    if (obj is Person) {
        val person = obj // smart cast 가능 (as type 생략)
        println(person.name)
    }
}

fun convertPersonIsNull(obj: Any) {
    // obj가 null 또는 Person 타입이 아니면 null 반환
    val person = obj as? Person
    println(person?.name)
}

// 어떤 타입이든 올 수 있음 -> 최상위 타입 === Object
fun superType(value: Any) {
    println("Value ${value}")
}

// Unit type은 생략 가능함
//fun unitType(): Unit {
fun unitType() {
    println("Unit type")
}

fun nothingType(message: String): Nothing {
    throw IllegalArgumentException(message)
}