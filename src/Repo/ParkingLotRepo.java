package Repo;

import Models.Address;
import Models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepo {
    private HashMap<Address, ParkingLot> parkingLotRepo;

    public ParkingLotRepo(){
        parkingLotRepo=new HashMap<Address, ParkingLot>();
    }

    public void addParkingLot(ParkingLot parkingLot){
        parkingLotRepo.put(parkingLot.getParkingLotAddress(),parkingLot);
    }

    public ParkingLot getParkingLot(Address address){
        if(parkingLotRepo.containsKey(address))
            return parkingLotRepo.get(address);
        return null;
    }
}
