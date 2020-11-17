package com.company.service;

import com.company.commands.Action;
import com.company.commands.CommandsRegistry;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandHandlerService {
    private final CommandsRegistry commandsRegistry;

    public void handle(String code) {
        commandsRegistry.get(code)
                .ifPresent(Action::action);
    }
}
