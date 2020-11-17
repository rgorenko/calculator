package com.company.operation.operators;

import com.company.operation.Operator;

public final class Addition implements Operator {
    private static final String PLUS = "+";

    private static final Operator INSTANCE = new Addition();

    private Addition() {
    }

    @Override
    public double applyAsDouble(double left, double right) {
        return left + right;
    }

    @Override
    public String symbol() {
        return PLUS;
    }

    public static Operator operator() {
        return INSTANCE;
    }
}
