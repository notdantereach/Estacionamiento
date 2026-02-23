// Ticket.java
package edu.lospedros.estacionamiento.process;

public class Ticket {
    private String id;
    private long startTime;
    private long endTime;

    public Ticket(String id, long startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    public String getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}