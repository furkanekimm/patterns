package com.ba.patterns.factorymethod.example1;

public class Motorcycle implements IVehicle {
    @Override
    public void DisplayInfo() {
        System.out.println("Motorcycle produced");
    }
}
