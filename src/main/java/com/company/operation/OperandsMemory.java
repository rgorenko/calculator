package com.company.operation;

import java.util.ArrayDeque;

public class OperandsMemory<T>  extends ArrayDeque<T> {
    private static final int MAX_SIZE = 2;

    @Override
    public void push(T operand) {
        while (this.size() >= MAX_SIZE) {
            this.removeLast();
        }
        super.push(operand);
    }

    @Override
    public T getLast() {
      return super.getLast();
    }

    @Override
    public T getFirst() {
        return super.getFirst();
    }
}
