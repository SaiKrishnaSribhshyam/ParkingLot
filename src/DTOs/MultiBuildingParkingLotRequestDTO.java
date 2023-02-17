package DTOs;

import Models.ParkingLotType;

public class MultiBuildingParkingLotRequestDTO {
    private ParkingLotType parkingLotType;
    private int bikeParkingCapcity;
    private int LMVParkingCapacity;
    private int HMVParkingCapacity;
    private int buildingsCount;

    public MultiBuildingParkingLotRequestDTO(int buildingsCount, ParkingLotType parkingLotType, int bikeParkingCapcity, int LMVParkingCapacity, int HMVParkingCapacity) {
        this.parkingLotType = parkingLotType;
        this.bikeParkingCapcity = bikeParkingCapcity;
        this.LMVParkingCapacity = LMVParkingCapacity;
        this.HMVParkingCapacity = HMVParkingCapacity;
        this.buildingsCount=buildingsCount;
    }

    public ParkingLotType getParkingLotType() {
        return parkingLotType;
    }

    public int getBikeParkingCapcity() {
        return bikeParkingCapcity;
    }

    public int getLMVParkingCapacity() {
        return LMVParkingCapacity;
    }

    public int getHMVParkingCapacity() {
        return HMVParkingCapacity;
    }

    public int getBuildingsCount() {
        return buildingsCount;
    }
}
