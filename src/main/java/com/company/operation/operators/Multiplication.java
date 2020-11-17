package com.company.operation.operators;

import com.company.operation.Operator;

public final class Multiplication implements Operator {
    private final static String ASTERISK = "*";

    private final static Operator INSTANCE = new Multiplication();

    private Multiplication() {
    }

    @Override
    public double applyAsDouble(double left, double right) {
        return left * right;
    }

    @Override
    public String symbol() {
        return ASTERISK;
    }

    public static Operator operator() {
        return INSTANCE;
    }
}
