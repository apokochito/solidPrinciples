package com.principles.di;

public class AddCalculatorOperation implements CalculateOperation{

    @Override
    public double calculate(double x, double y) {
        return x + y;
    }

}
