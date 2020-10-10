package com.principles.di;

public class DivideCalculatorOperation implements CalculateOperation {

    @Override
    public double calculate(double x, double y) {
        return x / y;
    }

}
