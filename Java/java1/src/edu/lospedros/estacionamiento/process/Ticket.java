package edu.lospedros.estacionamiento.process;

import edu.lospedros.estacionamiento.data.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
    private final String id;
    private final Vehicle vehicle;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String id, Vehicle vehicle, LocalDateTime entryTime) {
        this.id = Objects.requireNonNull(id, "id");
        this.vehicle = Objects.requireNonNull(vehicle, "vehicle");
        this.entryTime = Objects.requireNonNull(entryTime, "entryTime");
    }

    public String getId() { return id; }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = Objects.requireNonNull(exitTime, "exitTime");
    }

    public Vehicle getVehicle() { return vehicle; }
    public LocalDateTime getEntryTime() { return entryTime; }
    public LocalDateTime getExitTime() { return exitTime; }

    public Duration calculateParkingDuration() {
        if (exitTime == null) {
            throw new IllegalStateException("exitTime not set");
        }
        if (exitTime.isBefore(entryTime)) {
            throw new IllegalArgumentException("exitTime cannot be before entryTime");
        }
        return Duration.between(entryTime, exitTime);
    }
}