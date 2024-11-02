package sec02.lec12

class Person private constructor(
    private val name: String,
    private val age: Int,
) {

    /*
    - static 대신 companion object 사용
    - static 처럼 접근가능
    - 동반객체도 하나의 객체로 간주 -> 이로인해, 이름을 붙일 수 있고 interface 구현이 가
     */
    companion object Factory : Log {
        // const 가 붙으면 컴파일시 , 안붙으면 런타임시 할당
        // 기본타입과 String 에 붙일 수 있
        private const val MIN_AGE = 0;
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun printParam() {
            println("인터페이스 구현이 가능하다니?!")
        }
    }
}