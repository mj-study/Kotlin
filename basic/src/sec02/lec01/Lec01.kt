package sec02.lec01

import sec02.Person

class Lec01 {

    fun main() {
        /*
        var => 가변
        val => 불변
         */
        var num = 1_000L // long num = 1_000L;
        num = 3_000L

        val num2 = 10L // long num2 = 10L;
        // num2 = 30L => 불변

        var num3: Int
        // println(num3) => 초기화 하지 않고 사용하면 에러 발생
        num3 = 10
        println(num3)


        // val 컬렉션에는 element 사용 가능
        val numList: MutableList<Int> = mutableListOf()
        numList.add(20)
        numList.add(30)
        numList.add(40)

        // nullable 변수 사용
        // null이 변수에 들어갈 수 있다면 `타입?` 를 사용해야함
        var num4: Int? = null

        // 객체 인스턴스화 할때는 new 를 붙이지 않음
        val person = Person("한강")
    }

}