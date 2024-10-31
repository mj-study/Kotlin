package sec02.lec10

interface Swimable {

    val name: String
        get() = "ABC"

    // default 키워드 없이 메소드 구현 가능
    fun act() {
        println("어푸어푸")
    }
}