package com.ba.patterns.factorymethod.example1;

public class Truck implements IVehicle {

    @Override
    public void DisplayInfo() {
        System.out.println("Truck produced");
    }
}
