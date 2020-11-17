package com.company.functional

import com.company.BaseSpec

class SubtractionSpec extends BaseSpec {

    def "should subtract one number from another" () {
        given:
            calculator.input("9")
            calculator.input("1")
        when:
            def result = calculator.input("-")
        then:
            result == 8
    }
}
