package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class JunitTest {

    // static 과 같은 효과
    companion object {
        // JvmStatic 붙여야 실행됨
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("모든 테스트 시작 전")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("모든 테스트 종료 후")
        }
    }


    @Test
    fun test1() {
        println("테스트1")
    }

    @Test
    fun test2() {
        println("테스트2")
    }
}