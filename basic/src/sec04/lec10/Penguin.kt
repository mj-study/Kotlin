package sec04.lec10

class Penguin(species: String) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 걸어갑니다")
    }

    // 상위클래스에서 open 키워드를 붙여야 오버라이딩이 가능함
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}