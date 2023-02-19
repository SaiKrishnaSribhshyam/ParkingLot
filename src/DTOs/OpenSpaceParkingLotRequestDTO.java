package DTOs;

import Models.Address;
import Models.ParkingLotFeeModel;
import Models.ParkingLotType;
import Strategies.SlabFeeModelStrategy;

public class OpenSpaceParkingLotRequestDTO {
    private ParkingLotType parkingLotType;
    private int bikeParkingCapcity;
    private int LMVParkingCapacity;
    private int HMVParkingCapacity;
    private Address address;
    private ParkingLotFeeModel parkingLotFeeModel;

    public OpenSpaceParkingLotRequestDTO(ParkingLotType parkingLotType, int bikeParkingCapcity, int LMVParkingCapacity, int HMVParkingCapacity,ParkingLotFeeModel parkingLotFeeModel,Address address) {
        this.parkingLotType = parkingLotType;
        this.bikeParkingCapcity = bikeParkingCapcity;
        this.LMVParkingCapacity = LMVParkingCapacity;
        this.HMVParkingCapacity = HMVParkingCapacity;
        this.parkingLotFeeModel=parkingLotFeeModel;
        this.address=address;
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

    public Address getAddress() {
        return address;
    }

    public ParkingLotFeeModel getParkingLotFeeModel() {
        return parkingLotFeeModel;
    }
}
