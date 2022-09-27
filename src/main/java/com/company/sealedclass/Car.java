package com.company.sealedclass;

public final class Car extends Vehicle{

    Integer passengerNum;

    public Car(String manufacturer, String model, Integer passengerNum) {
        super(manufacturer, model);
        this.passengerNum = passengerNum;
    }
}
