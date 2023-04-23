package com.group.librarayapp.calculator

import com.group.libraryapp.calculator.Calculator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    internal fun add_test() {
        val calculator = Calculator(5)

        calculator.add(3)

        Assertions.assertEquals(8, calculator.number)
    }

    @Test
    internal fun minus_test() {
        val calculator = Calculator(5)

        calculator.minus(3)

        Assertions.assertEquals(2, calculator.number)
    }

    @Test
    internal fun multiply_test() {
        val calculator = Calculator(5)

        calculator.multiply(2)

        Assertions.assertEquals(10 , calculator.number)
    }

    @Test
    internal fun divide_test() {
        val calculator = Calculator(6)

        calculator.divide(2)

        Assertions.assertEquals(3, calculator.number)
    }
}