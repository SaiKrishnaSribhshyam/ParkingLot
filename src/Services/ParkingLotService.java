package Services;

import Exceptions.NoAvailalbeParkingSpotException;
import Models.*;

public class ParkingLotService {
    private ParkingAreaService parkingAreaService;
    public ParkingLotService(ParkingAreaService parkingAreaService){
        this.parkingAreaService=parkingAreaService;
    }

    public ParkingArea getnextAvailableParkingArea(ParkingLot parkingLot, VehicleType vehicleType){

        if(parkingLot instanceof OpenSpaceParkingLot){
            OpenSpaceParkingLot openSpaceParkingLot=(OpenSpaceParkingLot) parkingLot;
            if(parkingAreaService.getCountOfVacantSpots(openSpaceParkingLot.getParkingArea(),vehicleType)>0)
                return openSpaceParkingLot.getParkingArea();

        }
        else if(parkingLot instanceof MultiBuildingParkingLot){
            MultiBuildingParkingLot multiBuildingParkingLot= (MultiBuildingParkingLot) parkingLot;
            for(Building building:multiBuildingParkingLot.getBuildings()){
                for(ParkingArea parkingArea:building.getFloors()){
                    if(parkingAreaService.getCountOfVacantSpots(parkingArea,vehicleType)>0)
                        return parkingArea;
                }
            }
        }

        throw new NoAvailalbeParkingSpotException("All Parking slots are full!");
    }
}
