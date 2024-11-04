package sec05.lec16


fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. 현재 값: ${name}")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    // Person 생성

    return Person(firstName, lastName)
}

class Person(val firstName: String, val lastName: String)
