package com.company.commands;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommandsRegistry {
    private final Map<String, Command> commands;

    public CommandsRegistry(CommandsProvider commandsProvider) {
        this.commands = commandsProvider.provide()
                .stream()
                .collect(Collectors.toMap(Command::code, Function.identity()));
    }

    public Optional<Command> get(String code) {
        return Optional.ofNullable(commands.get(code));
    }
}
