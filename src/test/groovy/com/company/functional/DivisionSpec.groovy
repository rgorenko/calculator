package com.company.functional

import com.company.BaseSpec

class DivisionSpec extends BaseSpec {

    def "should divide one number by another" () {
        given:
            calculator.input("5")
            calculator.input("8")
        when:
            def result = calculator.input("/")
        then:
            result == 0.625
    }
}
