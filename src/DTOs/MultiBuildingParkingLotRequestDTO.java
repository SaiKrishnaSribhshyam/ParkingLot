package DTOs;

import Models.Address;
import Models.ParkingLotType;
import Strategies.SlabFeeModelStrategy;

public class MultiBuildingParkingLotRequestDTO {
    private ParkingLotType parkingLotType;
    private int bikeParkingCapcity;
    private int LMVParkingCapacity;
    private int HMVParkingCapacity;
    private int noOfbuildings;
    private int noOfFloorsInEachBuilding;
    private Address address;
    private SlabFeeModelStrategy slabFeeModelStrategy;

    public MultiBuildingParkingLotRequestDTO(int noOfbuildings, int noOfFloorsInEachBuilding,ParkingLotType parkingLotType, int bikeParkingCapcity, int LMVParkingCapacity, int HMVParkingCapacity,Address address,SlabFeeModelStrategy slabFeeModelStrategy) {
        this.parkingLotType = parkingLotType;
        this.bikeParkingCapcity = bikeParkingCapcity;
        this.LMVParkingCapacity = LMVParkingCapacity;
        this.HMVParkingCapacity = HMVParkingCapacity;
        this.noOfbuildings =noOfbuildings;
        this.slabFeeModelStrategy=slabFeeModelStrategy;
        this.address=address;
        this.noOfFloorsInEachBuilding=noOfFloorsInEachBuilding;
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

    public int getNoOfbuildings() {
        return noOfbuildings;
    }

    public Address getAddress() {
        return address;
    }

    public SlabFeeModelStrategy getSlabFeeModelStrategy() {
        return slabFeeModelStrategy;
    }

    public int getNoOfFloorsInEachBuilding() {
        return noOfFloorsInEachBuilding;
    }
}
