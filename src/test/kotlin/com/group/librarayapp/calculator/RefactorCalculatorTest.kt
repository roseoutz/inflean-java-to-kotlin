package com.group.librarayapp.calculator

import com.group.libraryapp.calculator.Calculator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class RefactorCalculatorTest {

    @Test
    fun add_test() {
        val calculator = Calculator(5)

        calculator.add(3)

        assertThat(calculator.number).isEqualTo(8)
    }

    @Test
    fun minus_test() {
        val calculator = Calculator(5)

        calculator.minus(3)

        assertThat(calculator.number).isEqualTo(2)
    }

    @Test
    fun multiply_test() {
        val calculator = Calculator(5)

        calculator.multiply(2)

        assertThat(calculator.number).isEqualTo(10)
    }

    @Test
    fun divide_test() {
        val calculator = Calculator(6)

        calculator.divide(2)

        assertThat(calculator.number).isEqualTo(3)
    }

    @Test
    fun divide_exception_test() {
        val calculator = Calculator(5)


        assertThrows<IllegalArgumentException> { calculator.divide(0) }
            .apply { assertThat(message).isEqualTo("number cannot divide 0") }
    }
}