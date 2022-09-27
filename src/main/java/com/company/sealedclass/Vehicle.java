package com.company.sealedclass;

/**
 * sealed permite sellar la herencia solo a aquellas clases permitidas
 */
public sealed class Vehicle permits Car, MotorCycle, Truck {

    String manufacturer;
    String model;

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
