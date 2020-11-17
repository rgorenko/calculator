package com.company.operation;

import com.company.operation.operators.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperatorsProvider {

    public Collection<Operator> provide() {
        return Stream.of(Addition.operator(), Subtraction.operator(), Multiplication.operator(), Division.operator())
                .collect(Collectors.toCollection(HashSet::new));
    }
}
