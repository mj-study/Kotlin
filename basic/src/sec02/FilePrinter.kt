package sec02

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    /**
     * Kotlin 에서는 unChecked, checked 예외가 구분이 없으므로
     * FileNotFoundException 이런 예외 처리하지 않아도됨
     * try catch 강제 x
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readText())
        reader.close()
    }

    /**
     * try-with resources 이용
     * => use 사용 (inline 확장함수 사용)
     * 블록이 끝나면 자동으로 close() 메서드 호출하여 리소스를 자동으로 해제함
     */
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}