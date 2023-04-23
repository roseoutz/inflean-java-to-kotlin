package com.group.libraryapp.calculator

import java.lang.IllegalArgumentException

class Calculator(
    var number: Int
){
    fun add(operand: Int) {
        this.number += operand
    }

    fun minus(operand: Int) {
       this.number -= operand
    }

    fun multiply(operand: Int) {
        this.number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("number cannot divide 0")
        }
        this.number /= operand
    }
}