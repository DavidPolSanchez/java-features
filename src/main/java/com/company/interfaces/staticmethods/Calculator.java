package com.company.interfaces.staticmethods;

public interface Calculator {

    static Calculator getInstance(){
        return new BasicCalculator();
    }

    int add(int first, int second);

}
