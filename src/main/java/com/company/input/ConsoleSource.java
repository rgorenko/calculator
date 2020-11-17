package com.company.input;

import lombok.RequiredArgsConstructor;

import java.io.Console;

@RequiredArgsConstructor
class ConsoleSource extends AbstractInputSource {
    private final Console console;

    @Override
    public String readLine() throws ConsoleException {
        return console.readLine();
    }

}