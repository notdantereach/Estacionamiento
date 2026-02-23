package edu.lospedros.estacionamiento.data;

public class SimpleVehicle implements Vehicle {
    private final String licensePlate;
    private final VehicleSize size;

    public SimpleVehicle(String licensePlate, VehicleSize size) {
        this.licensePlate = licensePlate;
        this.size = size;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public VehicleSize getSize() {
        return size;
    }
}