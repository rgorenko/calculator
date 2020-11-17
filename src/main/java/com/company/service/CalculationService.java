package com.company.service;

import com.company.operation.OperandsMemory;
import com.company.operation.OperatorRegistry;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.function.DoubleBinaryOperator;

@RequiredArgsConstructor
public class CalculationService {
    private final OperatorRegistry operatorRegistry;
    private final OperandsMemory<Double> operandsMemory;

    public Double input(String input) {
        Double result = operatorRegistry.get(input)
                .map(this::applyOperation)
                .orElseGet(() -> Double.valueOf(input));
        operandsMemory.push(result);
        return result;
    }

    private Double applyOperation(DoubleBinaryOperator operator) {
        return operator.applyAsDouble(operandsMemory.getLast(), operandsMemory.getFirst());
    }
}
