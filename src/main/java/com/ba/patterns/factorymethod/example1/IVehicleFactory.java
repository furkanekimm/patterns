package com.ba.patterns.factorymethod.example1;

public interface IVehicleFactory {
    IVehicle ProduceVehicle(VehicleType type);
}
