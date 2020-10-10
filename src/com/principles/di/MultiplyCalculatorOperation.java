package com.principles.di;

public class MultiplyCalculatorOperation implements CalculateOperation {

    @Override
    public double calculate(double x, double y) {
        return x * y;
    }

}
