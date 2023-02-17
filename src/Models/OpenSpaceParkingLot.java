package Models;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OpenSpaceParkingLot extends ParkingLot{
    private ParkingArea parkingArea;
    private int bikeParkingCapacity;
    private int lmvParkingCapacity;
    private int hmvParkingCapacity;

    public OpenSpaceParkingLot(int bikeParkingCapacity,int lmvParkingCapacity,int hmvParkingCapacity){
        this.bikeParkingCapacity=bikeParkingCapacity;
        this.lmvParkingCapacity=lmvParkingCapacity;
        this.hmvParkingCapacity=hmvParkingCapacity;
        parkingArea=new ParkingArea(bikeParkingCapacity,lmvParkingCapacity,hmvParkingCapacity);
    }

    private void loadParkingSpots(List<ParkingSpot> parkingSpotList, VehicleType vehicleType, int length) {
        for(int i=0;i<length;i++){
            parkingSpotList.add(new ParkingSpot(i+1,vehicleType));
        }
    }

    public ParkingArea getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(ParkingArea parkingArea) {
        this.parkingArea = parkingArea;
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
