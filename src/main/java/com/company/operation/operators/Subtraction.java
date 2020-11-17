package com.company.operation.operators;

import com.company.operation.Operator;

public final class Subtraction implements Operator {
    private final static String MINUS = "-";

    private final static Operator INSTANCE = new Subtraction();

    private Subtraction() {
    }

    @Override
    public double applyAsDouble(double left, double right) {
        return left - right;
    }

    @Override
    public String symbol() {
        return MINUS;
    }

    public static Operator operator() {
        return INSTANCE;
    }
}
