package com.company.service;

import com.company.input.AbstractInputSource;
import lombok.AllArgsConstructor;

import javax.annotation.PostConstruct;

@AllArgsConstructor
public class InputListener {
    private final AbstractInputSource inputSource;
    private final InputHandlerService inputHandlerService;
    private boolean isListening;

    @PostConstruct
    public void listen() {
        do {
            String input = inputSource.readLine();
            echoInput(input);
            try {
                inputHandlerService.handle(input);
            } catch (NullPointerException exception) {
                isListening = false;
            }
        } while (isListening);
    }

    private void echoInput(String input) {
        System.out.println("> " + input);
    }
}
