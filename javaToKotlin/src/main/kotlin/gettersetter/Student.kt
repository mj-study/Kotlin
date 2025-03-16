package gettersetter

import java.time.LocalDate

class Student {

    @JvmField
    var name: String? = null
    var birthDate: LocalDate? = null

    val age: Int = 10

    var grade: String? = null
        private set // 접근제어자 private 사용하면 현재 클래스에서만 접근 가능함

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}