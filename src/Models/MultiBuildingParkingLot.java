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
}
