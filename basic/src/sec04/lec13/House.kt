package sec04.lec13

class House(
    var address: String,
    var livingRoom: LivingRoom = LivingRoom(10.0)
) {

    /*
    - 기본적으로 바깥 클래스(House)에 대한 연결이 없는 중첩 클래스가 생성
     */
    class LivingRoom(
        private var area: Double,
    )
}


class House2(
    var address: String,
) {

    var livingRoom = this.LivingRoom2(10.0)

    /*
    - 권장되지 않는 내부 클래스
     */
    inner class LivingRoom2(
        private var area: Double,
    ) {

        // 바깥 클래스 참조를 위해 this@바깥클래스 사용
        val address: String
            get() = this@House2.address
    }
}