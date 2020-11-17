package com.company.operation;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OperatorRegistry {
    private final Map<String, Operator> supportedOperators;

    public OperatorRegistry(OperatorsProvider operatorsProvider) {
        this.supportedOperators = operatorsProvider.provide()
                .stream()
                .collect(Collectors.toMap(Operator::symbol, Function.identity()));
    }

    public Optional<Operator> get(String code) {
        return Optional.ofNullable(supportedOperators.get(code));
    }
}
