package sec02.lec09

class Person(val name: String, var age: Int = 1) {
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다")
        }
    }

    // 부생성자보다는 default parameter 권장
//    constructor(name: String) : this(name, 1)

    /**
     * #3. 커스텀 getter, setter
     */
    // 방법1. 함수형
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // 방법2. 함수형 - 함수선언
//    fun isAdult(): Boolean = this.age >= 20

    // 방법3. 커스텀 getter
    val isAdult: Boolean
        get() = this.age >= 20

//    val name: String = name
//        get() = field.uppercase()
}

fun main() {
    val person = Person("한강", 30)
    println(person.name)
    person.age = 31
    println(person.age)

    Person("민지")
}