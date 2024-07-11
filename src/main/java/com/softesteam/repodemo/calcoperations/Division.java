package com.softesteam.repodemo.calcoperations;

public class Division {
    public Division() {
    }

    public double division(double a, double b) {
        if (b==0)
            throw new ArithmeticException("Division by zero");
        else
            return a / b;
    }
}
