package com.company.service

import com.company.operation.OperandsMemory
import com.company.operation.OperatorRegistry
import com.company.operation.operators.Addition
import spock.lang.Specification

class CalculationServiceSpec extends Specification {

    OperatorRegistry operatorRegistry = Mock()
    OperandsMemory<Double> operandsMemory = Mock()

    def first = "2"
    def last = "3"
    def plus = "+"
    def sum = 5D

    def target = new CalculationService(operatorRegistry, operandsMemory)

    def "should return input if number provided" () {
        when:
            def expected = Double.valueOf(first)
            def result = target.input(first)
        then:
            result == expected
            1 * operatorRegistry.get(first) >> Optional.empty()
            1 * operandsMemory.push(Double.valueOf(first))
            0 * _
    }

    def "should return result if operator provided" () {
        when:
            def expected = 5D
            def result = target.input(plus)
        then:
            result == expected
            1 * operatorRegistry.get(plus) >> Optional.of(Addition.operator())
            1 * operandsMemory.getFirst() >> Double.valueOf(first)
            1 * operandsMemory.getLast() >> Double.valueOf(last)
            1 * operandsMemory.push(sum)
            0 * _
    }

}
