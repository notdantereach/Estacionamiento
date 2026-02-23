package edu.lospedros.estacionamiento.process;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Duration calculateParkingDuration() {
        return Duration.between(entryTime, exitTime != null ? exitTime : LocalDateTime.now());
    }

    // Getters and setters
}