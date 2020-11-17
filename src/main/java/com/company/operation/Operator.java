package com.company.operation;

import java.util.function.DoubleBinaryOperator;

public interface Operator extends DoubleBinaryOperator {
    String symbol();
}
