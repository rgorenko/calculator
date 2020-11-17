package com.company.functional

import com.company.BaseSpec

class MultiplicationSpec extends BaseSpec {

    def "should multiply two numbers" () {
        given:
            calculator.input("-2.0")
            calculator.input("-3.0")
        when:
            def result = calculator.input("*")
        then:
            result == 6.0
    }
}

