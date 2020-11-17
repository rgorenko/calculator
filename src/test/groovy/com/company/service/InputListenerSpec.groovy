package com.company.service

import com.company.input.AbstractInputSource
import spock.lang.Specification

class InputListenerSpec extends Specification {

    AbstractInputSource inputSource = Mock()
    InputHandlerService inputHandlerService = Mock()
    boolean isListening = false

    def listener = new InputListener(inputSource, inputHandlerService, isListening)

    def input = "+"

    def "should listen for input one time"() {
        when:
            listener.listen()
        then:
            1 * inputSource.readLine() >> input
            1 * inputHandlerService.handle(input)
            0 * _
    }
}
