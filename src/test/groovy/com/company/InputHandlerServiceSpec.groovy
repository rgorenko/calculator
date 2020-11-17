package com.company

import com.company.service.CalculationService
import com.company.service.CommandHandlerService
import com.company.service.InputHandlerService

class InputHandlerServiceSpec extends BaseSpec {

    CommandHandlerService commandHandlerService = Mock()
    CalculationService calculationService = Mock()

    def numberInput = "7"
    def unsupportedOperator = "&"

    def target = new InputHandlerService(commandHandlerService, calculationService)

    def "should handle input"() {
        when:
            target.handle(numberInput)
        then:
            1 * commandHandlerService.handle(numberInput)
            1 * calculationService.input(numberInput)
    }

    def "should handle incorrect input"() {
        when:
            target.handle(unsupportedOperator)
        then:
            1 * commandHandlerService.handle(unsupportedOperator)
            1 * calculationService.input(unsupportedOperator) >> {throw new NumberFormatException()}
    }
}
