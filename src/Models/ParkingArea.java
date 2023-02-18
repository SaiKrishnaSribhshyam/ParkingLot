package Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingArea {
    private List<ParkingSpot> bikeParkingSpots;
    private List<ParkingSpot> lmvParkingSpots;
    private List<ParkingSpot> hmvParkingSpots;
    private int bikeParkingCapacity;
    private int lmvParkingCapacity;
    private int hmvParkingCapacity;

    public ParkingArea(int bikeParkingCapacity,int lmvParkingCapacity,int hmvParkingCapacity){
        this.bikeParkingCapacity=bikeParkingCapacity;
        this.lmvParkingCapacity=lmvParkingCapacity;
        this.hmvParkingCapacity=hmvParkingCapacity;
        bikeParkingSpots=new ArrayList<ParkingSpot>();
        lmvParkingSpots=new ArrayList<ParkingSpot>();
        hmvParkingSpots=new ArrayList<ParkingSpot>();
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
