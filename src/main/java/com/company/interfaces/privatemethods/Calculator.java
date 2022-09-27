package com.company.interfaces.privatemethods;

public interface Calculator {

    double DOUBLE = 0.21;

    void add(int num1, int num2);

    default double complexOperation(double price){
        double iva = calculateIva(price);
        // .... resto de operaciones
        return price;
    }

    // los métodos privados sirven de apoyo a los métodos default
    private double calculateIva(double price){
        return price * DOUBLE;
    }
}
