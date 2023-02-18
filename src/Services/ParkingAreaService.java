package Services;

import Models.ParkingArea;
import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Models.VehicleType;

import java.util.List;

public class ParkingAreaService {
    public void loadParkingArea(ParkingArea parkingArea){
        loadParkingSpots(parkingArea.getBikeParkingSpots(),parkingArea.getBikeParkingCapacity(),VehicleType.MOTORCYCLE);
        loadParkingSpots(parkingArea.getLmvParkingSpots(),parkingArea.getLmvParkingCapacity(),VehicleType.CAR);
        loadParkingSpots(parkingArea.getHmvParkingSpots(),parkingArea.getHmvParkingCapacity(),VehicleType.BUS);
    }

    public void loadParkingSpots(List<ParkingSpot> parkingSpotList, int capacity, VehicleType vehicleType){
        for(int i=0;i<capacity;i++){
            parkingSpotList.add(new ParkingSpot(i+1,vehicleType));
        }
    }

    public int getCountOfVacantSpots(ParkingArea parkingArea, VehicleType vehicleType){
        int vacancy=0;
        if(vehicleType==VehicleType.MOTORCYCLE||vehicleType==VehicleType.SCOOTER)
            vacancy+=getCurrentVaccancy(parkingArea.getBikeParkingSpots());
        else if(vehicleType==VehicleType.BUS||vehicleType==VehicleType.TRUCK)
            vacancy+=getCurrentVaccancy(parkingArea.getHmvParkingSpots());
        else if(vehicleType==VehicleType.CAR||vehicleType==VehicleType.SUV)
            vacancy+=getCurrentVaccancy(parkingArea.getLmvParkingSpots());

        return vacancy;
    }

    public int getCurrentVaccancy(List<ParkingSpot> parkingSpotList){
        int count=0;
        int length=parkingSpotList.size();
        for(int i=0;i<length;i++){
            if(parkingSpotList.get(i).getParkingSpotStatus()== ParkingSpotStatus.AVAILABLE)
                count++;
        }
        return count;
    }
}
