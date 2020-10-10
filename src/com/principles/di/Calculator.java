package com.principles.di;

public class Calculator {

    CalculateOperation calculateOperation;

    public Calculator(CalculateOperation calculateOperation) {
        this.calculateOperation = calculateOperation;
    }

    public double Solve(double x, double y) {
        // Calculations will be based on the "injected" ICalculatorOperation.
        return calculateOperation.calculate(x, y);
    }
}
