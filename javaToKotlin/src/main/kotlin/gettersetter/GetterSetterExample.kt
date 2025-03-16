package gettersetter

fun main() {
    // Java 스타일
    val person = Person()
    person.setName("김또깡")
    person.setAge(20)
    person.setAddress("서울")

    println(person.getName())
    println(person.getAge())
    println(person.getAddress())

    // Kotlin 스타일
    val person2 = Person()
    person2.name = "김미나"
    person2.age = 25

    println(person2.name)
    println(person2.age)

    // 프로퍼티가 없어도 getter 메서드면 프로퍼티처럼 사용 가능
    println(person2.uuid)

}