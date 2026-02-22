package data;

public class Vehicle {
    private String id;
    private String size; // e.g., "small", "medium", "large"

    public Vehicle(String id, String size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }
}