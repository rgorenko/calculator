package com.company.operation.operators;

import com.company.operation.Operator;

public final class Division implements Operator {
    private static final String SLASH = "/";

    private static final Operator INSTANCE = new Division();

    private Division() {
    }

    @Override
    public double applyAsDouble(double left, double right) {
        return left / right;
    }

    @Override
    public String symbol() {
        return SLASH;
    }

    public static Operator operator() {
        return INSTANCE;
    }
}
