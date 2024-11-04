package sec05.lec16

fun main() {
    val str = "abc"
    println(str.lastChar())

    val train: Train = Train()
    train.isExpensive() // Train 확장함수 호출

    val srt1: Train = Srt()
    srt1.isExpensive() // Train 확장함수 호출

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt 확장함수 호출

    val str2 = "bca"
    println(str2.lastChar2) // 확장 프로퍼티
}

// 확장하려는클래스.함수명
fun String.lastChar(): Char {
    // this를 통해 인스턴스에 접근 가능
    // 원래 String에 있는 멤버함수처럼 사용 가능
    // 확장함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없음
    return this[this.length - 1]
}

open class Train(
    val name: String = "무궁화",
    val price: Int = 10_000
)

fun Train.isExpensive(): Boolean {
    println("Train 확장함수")
    return this.price >= 15_000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt 확장함수")
    return this.price >= 15_000
}

// ---------
// 확장 프로퍼티
val String.lastChar2: Char
    get() = this[this.length - 1]