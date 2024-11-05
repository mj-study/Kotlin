package sec06.lec20

fun main() {
    // let 사용
    val name: String? = "Kotlin"
    name?.let { println("Name is $it") }

    // run 사용
    val person = Person("리지", 30)
    val ageNextYear = person.run {
        println("현재 나이: ${this.age}")
        age + 1 // this 생략 가능
    }
    println(ageNextYear)

    // with
    val person1 = Person("준", 29)
    val intro = with(person1) {
        "안녕 내이름은 $name 나이는 $age"
    }
    println(intro)

    // apply
    val person2 = Person("미키", 15).apply {
        age = 16
        println("나이 1살 추가요~ $age")
    }


    // also
    val name2 = "Kotlin".also {
        println("The name is $it")
    } // name2 객체 반환


}

class Person(val name: String, var age: Int)