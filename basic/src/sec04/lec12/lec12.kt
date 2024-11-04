package sec04.lec12

fun main() {
    // Kotlin 에서 Java와 동일하게 static 함수를 바로 접근 가능
    Person.newBaby("hi")

    // 익명 클래스 구현
    moveSomething(object : Moveable {
        override fun move() {
            println("움직여 ~ 움직여 ~")
        }

        override fun fly() {
            println("날아가는 새들 처럼~")
        }

    })
}

private fun moveSomething(moveable: Moveable) {
    moveable.move()
    moveable.fly()
}