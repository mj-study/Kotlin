package ch02

import ch02.Color.*

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
    fun printColor() = println("$this is ${rgb()}")
}

fun main() {
    println(getMnemoic(BLUE))
}

fun getMnemoic(color: Color) =
    when (color) {
        RED -> "Richard"
        ORANGE -> "Of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun measureColor() = ORANGE
fun getWarmthFromSensor() =
    // when 식 대상을 변수로 캡처
    when (val color = measureColor()) {
        RED, ORANGE, YELLOW -> "warm ${color.r}" // 변수 프로퍼티 접근 가능
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }