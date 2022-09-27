package com.company.interfaces.staticmethods;

public class Main {

    public static void main(String[] args) {
//        Calculator calculator = new BasicCalculator();
        Calculator calculator = Calculator.getInstance();
        calculator.add(1,1);
    }
}
