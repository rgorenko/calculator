package com.company.service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InputHandlerService {
    private final CommandHandlerService commandHandlerService;
    private final CalculationService calculationService;

    public void handle(String code) {
        commandHandlerService.handle(code);
        try {
            Double result = calculationService.input(code);
            printResult(result);
        } catch (NumberFormatException exception) {
            printIncorrectInputMessage();
        }
    }

    private void printResult(Double result) {
        System.out.println(result);
    }

    private void printIncorrectInputMessage() {
        System.out.println("Incorrect input");
        System.out.println("Please input number, operator (supported +,-,*,/)");
        System.out.println("or 'q' for exit");
    }
}
