package com.company.functional

import com.company.BaseSpec

class AdditionSpec extends BaseSpec {

    def "should add two numbers" () {
        given:
            calculator.input("1")
            calculator.input("2")
        when:
            def result = calculator.input("+")
        then:
            result == 3
    }
}
