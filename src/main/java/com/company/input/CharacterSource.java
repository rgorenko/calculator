package com.company.input;

import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;

@RequiredArgsConstructor
class CharacterSource extends AbstractInputSource {
    private final BufferedReader reader;

    @Override
    public String readLine() throws ConsoleException {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new IllegalStateException();
        }
    }
}