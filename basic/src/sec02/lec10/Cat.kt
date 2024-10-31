package sec02.lec10

/*
상속은 콜론을 이용해서 함 -> class, interface 구현 마찬가지
상속할때 생성자 바로 호출 가능 Animal(species, 4)
 */
class Cat(species: String) : Animal(species, 4) {

    // Java와 달리 override 지시어를 사용해서 오버라이딩함
    override fun move() {
        println("꽁꽁 얼어붙은 한강위로 고양이가 걸어다닙니다.")
    }
}