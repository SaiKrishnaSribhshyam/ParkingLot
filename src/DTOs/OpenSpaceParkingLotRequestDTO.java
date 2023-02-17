package DTOs;

import Models.ParkingLotType;

public class OpenSpaceParkingLotRequestDTO {
    private ParkingLotType parkingLotType;
    private int bikeParkingCapcity;
    private int LMVParkingCapacity;
    private int HMVParkingCapacity;

    public OpenSpaceParkingLotRequestDTO(ParkingLotType parkingLotType, int bikeParkingCapcity, int LMVParkingCapacity, int HMVParkingCapacity) {
        this.parkingLotType = parkingLotType;
        this.bikeParkingCapcity = bikeParkingCapcity;
        this.LMVParkingCapacity = LMVParkingCapacity;
        this.HMVParkingCapacity = HMVParkingCapacity;
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
}
