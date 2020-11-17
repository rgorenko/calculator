package com.company.input

import spock.lang.Specification

class CharacterSourceSpec extends Specification {
    BufferedReader reader = Mock()

    def source = new CharacterSource(reader)

    def line = "line"

    def "should handle IO exception"() {
        when:
            source.readLine()
        then:
            thrown(IllegalStateException)
            1 * reader.readLine() >> { throw new IOException()}
            0 * _
    }

    def "should handle input"() {
        when:
            def actual = source.readLine()
        then:
            actual == line
            1 * reader.readLine() >> line
            0 * _
    }
}
