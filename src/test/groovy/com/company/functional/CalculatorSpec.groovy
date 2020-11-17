package com.company.functional

import com.company.BaseSpec

class CalculatorSpec extends BaseSpec {

    def "should handle set of operations" () {
        given:
            calculator.input("6")
            calculator.input("4")
        when:
            calculator.input("+") == 10
        and:
            calculator.input("10")
            calculator.input("-") == 0
        and:
            calculator.input("*") == 0
        and:
            calculator.input("5")
            calculator.input("-7")
            calculator.input("2")
        then:
            calculator.input("/") == -3.5

    }

}
