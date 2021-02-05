package com.ba.patterns.factorymethod.example1;

public class Car implements IVehicle {
    @Override
    public void DisplayInfo() {
        System.out.println("Car produced");
    }
}
