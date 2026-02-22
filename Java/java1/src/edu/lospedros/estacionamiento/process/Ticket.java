// Ticket.java

package edu.lospedros.estacionamiento.process;

public class Ticket {
    private final String vehicleSize;
    private final long entryTime;
    private long exitTime;

    public Ticket(String vehicleSize, long entryTime) {
        this.vehicleSize = vehicleSize;
        this.entryTime = entryTime;
        this.exitTime = -1;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public long getDurationInHours() {
        return (exitTime - entryTime) / 3600000;
    }
}