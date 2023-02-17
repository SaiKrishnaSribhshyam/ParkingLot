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

    public int getParkingStatus(ParkingArea parkingArea, VehicleType vehicleType){
        int occupancy=0;
        if(vehicleType==VehicleType.MOTORCYCLE||vehicleType==VehicleType.SCOOTER)
            occupancy+=getCurrentOccupancy(parkingArea.getBikeParkingSpots());
        else if(vehicleType==VehicleType.BUS||vehicleType==VehicleType.TRUCK)
            occupancy+=getCurrentOccupancy(parkingArea.getHmvParkingSpots());
        else if(vehicleType==VehicleType.CAR||vehicleType==VehicleType.SUV)
            occupancy+=getCurrentOccupancy(parkingArea.getLmvParkingSpots());

        return occupancy;
    }

    public int getCurrentOccupancy(List<ParkingSpot> parkingSpotList){
        int count=0;
        int length=parkingSpotList.size();
        for(int i=0;i<length;i++){
            if(parkingSpotList.get(i).getParkingSpotStatus()== ParkingSpotStatus.OCCUPIED)
                count++;
        }
        return count;
    }
}
