package DTOs;

import Models.Address;
import Models.ParkingLotType;
import Strategies.SlabFeeModelStrategy;

public class OpenSpaceParkingLotRequestDTO {
    private ParkingLotType parkingLotType;
    private int bikeParkingCapcity;
    private int LMVParkingCapacity;
    private int HMVParkingCapacity;
    private Address address;
    private SlabFeeModelStrategy slabFeeModelStrategy;

    public OpenSpaceParkingLotRequestDTO(ParkingLotType parkingLotType, int bikeParkingCapcity, int LMVParkingCapacity, int HMVParkingCapacity,SlabFeeModelStrategy slabFeeModelStrategy,Address address) {
        this.parkingLotType = parkingLotType;
        this.bikeParkingCapcity = bikeParkingCapcity;
        this.LMVParkingCapacity = LMVParkingCapacity;
        this.HMVParkingCapacity = HMVParkingCapacity;
        this.slabFeeModelStrategy=slabFeeModelStrategy;
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

    public SlabFeeModelStrategy getSlabFeeModelStrategy() {
        return slabFeeModelStrategy;
    }
}
