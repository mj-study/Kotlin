package sec04.lec11

/*
따로 클래스 생성 없이 파일 최상단에 유틸 함수 작성하면 편리함
Java 에서는 유틸 클래스 생성시, private으로 생성자 접근 막고, 메서드로 접근하게 했었음
 */
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class Car(
    internal val name: String, // getter, setter 접근지시어 부여
    _price: Int
) {
    var price = _price
        private set // setter 에만 접근지시어 부여
}