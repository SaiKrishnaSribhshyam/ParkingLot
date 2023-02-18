package Models;

import java.util.ArrayList;
import java.util.List;

public class MultiBuildingParkingLot extends ParkingLot{
    private List<Building> buildings;
    private int bikeParkingCapacity;
    private int lmvParkingCapacity;
    private int hmvParkingCapacity;

    public MultiBuildingParkingLot(int buildingsCount,int bikeParkingCapacity,int lmvParkingCapacity,int hmvParkingCapacity){
        this.bikeParkingCapacity=bikeParkingCapacity;
        this.lmvParkingCapacity=lmvParkingCapacity;
        this.hmvParkingCapacity=hmvParkingCapacity;
        buildings=new ArrayList<Building>(buildingsCount);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public int getBikeParkingCapacity() {
        return bikeParkingCapacity;
    }

    public void setBikeParkingCapacity(int bikeParkingCapacity) {
        this.bikeParkingCapacity = bikeParkingCapacity;
    }

    public int getLmvParkingCapacity() {
        return lmvParkingCapacity;
    }

    public void setLmvParkingCapacity(int lmvParkingCapacity) {
        this.lmvParkingCapacity = lmvParkingCapacity;
    }

    public int getHmvParkingCapacity() {
        return hmvParkingCapacity;
    }

    public void setHmvParkingCapacity(int hmvParkingCapacity) {
        this.hmvParkingCapacity = hmvParkingCapacity;
    }
}
