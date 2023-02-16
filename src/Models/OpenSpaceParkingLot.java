package Models;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OpenSpaceParkingLot extends ParkingLot{
    private List<ParkingSpot> bikeParkingSpots;
    private List<ParkingSpot> lmvParkingSpots;
    private List<ParkingSpot> hmvParkingSpots;
    private int bikeParkingCapacity;
    private int lmvParkingCapacity;
    private int hmvParkingCapacity;

    public OpenSpaceParkingLot(int bikeParkingCapacity,int lmvParkingCapacity,int hmvParkingCapacity){
        this.bikeParkingCapacity=bikeParkingCapacity;
        this.lmvParkingCapacity=lmvParkingCapacity;
        this.hmvParkingCapacity=hmvParkingCapacity;
        bikeParkingSpots=new ArrayList<ParkingSpot>(bikeParkingCapacity);
        lmvParkingSpots=new ArrayList<ParkingSpot>(lmvParkingCapacity);
        hmvParkingSpots=new ArrayList<ParkingSpot>(hmvParkingCapacity);
        loadParkingSpots(bikeParkingSpots,VehicleType.MOTORCYCLE,bikeParkingCapacity);
        loadParkingSpots(lmvParkingSpots,VehicleType.CAR,lmvParkingCapacity);
        loadParkingSpots(hmvParkingSpots,VehicleType.BUS,hmvParkingCapacity);
    }

    private void loadParkingSpots(List<ParkingSpot> parkingSpotList, VehicleType vehicleType, int length) {
        for(int i=0;i<length;i++){
            parkingSpotList.add(new ParkingSpot(i+1,vehicleType));
        }
    }

    public List<ParkingSpot> getBikeParkingSpots() {
        return bikeParkingSpots;
    }

    public void setBikeParkingSpots(List<ParkingSpot> bikeParkingSpots) {
        this.bikeParkingSpots = bikeParkingSpots;
    }

    public List<ParkingSpot> getLmvParkingSpots() {
        return lmvParkingSpots;
    }

    public void setLmvParkingSpots(List<ParkingSpot> lmvParkingSpots) {
        this.lmvParkingSpots = lmvParkingSpots;
    }

    public List<ParkingSpot> getHmvParkingSpots() {
        return hmvParkingSpots;
    }

    public void setHmvParkingSpots(List<ParkingSpot> hmvParkingSpots) {
        this.hmvParkingSpots = hmvParkingSpots;
    }

}
