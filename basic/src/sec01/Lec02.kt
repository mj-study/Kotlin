package sec01

fun main() {
    Lec02().main()
}

class Lec02 {
    fun main() {
        startsWithA1("A")
        startsWithA2("A")
        startsWithA3("A")
        startsWithA4("A")
    }

    /**
     * null 이 들어오면 throw IllegalArgumentException
     */
    fun startsWithA1(str: String?): Boolean {
        return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔어요")
    }

    /**
     * null 이 들어오면 null 반환
     */
    fun startsWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
    }

    /**
     * null 이 들어오면 false 반환
     */
    fun startsWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }

    /**
     * null 이 절대 들어올 수 없는 경우 -> 단언
     */
    fun startsWithA4(str: String?): Boolean {
        return str!!.startsWith("A")
    }

}