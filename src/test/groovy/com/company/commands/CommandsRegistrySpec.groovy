package com.company.commands

import com.company.commands.supported.Exit
import spock.lang.Specification

class CommandsRegistrySpec extends Specification {
    CommandsProvider commandsProvider = new CommandsProvider()
    CommandsRegistry registry = new CommandsRegistry(commandsProvider)

    def code = "q"

    def "should provide supported command"() {
        when:
            def supportedCommand = registry.get(code)
        then:
            supportedCommand.get() == Exit.command()
    }
}
