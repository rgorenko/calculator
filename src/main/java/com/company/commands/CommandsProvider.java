package com.company.commands;

import com.company.commands.supported.Exit;
import com.company.commands.supported.InputEnd;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommandsProvider {

    public Set<Command> provide() {
        return Stream.of(Exit.command(), InputEnd.command())
                .collect(Collectors.toCollection(HashSet::new));
    }
}
