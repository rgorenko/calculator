package com.company.service

import com.company.commands.CommandsRegistry
import com.company.commands.supported.Exit
import spock.lang.Specification

class CommandHandlerServiceSpec extends Specification {
    CommandsRegistry commandsRegistry = Mock()
    Exit command = Mock()

    CommandHandlerService commandHandlerService = new CommandHandlerService(commandsRegistry)

    def quit = "q"
    def unknownCommand = "exit"

    def "should handle quit command" () {
        when:
            commandHandlerService.handle(quit)
        then:
            1 * commandsRegistry.get(quit) >> Optional.of(command)
            1 * command.action()
            0 * _
    }

    def "should not handle unsupported command" () {
        when:
            commandHandlerService.handle(unknownCommand)
        then:
            1 * commandsRegistry.get(unknownCommand) >> Optional.empty()
            0 * _
    }
}
