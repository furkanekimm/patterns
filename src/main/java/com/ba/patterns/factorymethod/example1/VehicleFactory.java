package com.ba.patterns.factorymethod.example1;

public class VehicleFactory implements IVehicleFactory {
    @Override
    public IVehicle ProduceVehicle(VehicleType type) {
        IVehicle vehicle = null;
        switch (type)
        {
            case Car:
                vehicle = new Car();
                break;
            case Truck:
                vehicle = new Truck();
                break;
            case Motorcycle:
                vehicle = new Motorcycle();
                break;
        }
        return vehicle;
    }
}
