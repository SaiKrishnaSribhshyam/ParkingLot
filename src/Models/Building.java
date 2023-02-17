package Models;

import java.util.List;

public class Building {
    private String id;
    private List<ParkingArea> floors;
    private int bikeParkingCapacity;
    private int lmvParkingCapacity;
    private int hmvParkingCapacity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ParkingArea> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingArea> floors) {
        this.floors = floors;
    }
}
