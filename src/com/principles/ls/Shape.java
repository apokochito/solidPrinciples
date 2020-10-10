package com.principles.ls;

public abstract class Shape {

    // Classes must, therefore, operate in the same manner as their base classes.
    private double height;
    private double width;

    public double area() {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
