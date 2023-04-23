package com.group.librarayapp.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    @BeforeEach
    fun beforeEach() {
        println("before each")
    }

    @AfterEach
    fun afterEach() {
        println("after each")
    }

    @Test
    fun test1() {
        println("테스트 1")
    }

    @Test
    fun test2() {
        println("test2")
    }

    @Test
    fun collection_test() {
        val list = listOf(1,2,3,4,5)

        assertThat(list).hasSize(5)
    }

    data class Person(val name: String)

    @Test
    fun collection_test2() {
        val list = listOf(Person("A"), Person("B"))

        assertThat(list).extracting("name").containsExactlyInAnyOrder("A", "B")
    }
}