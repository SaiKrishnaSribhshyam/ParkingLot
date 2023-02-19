package Controllers;

import DTOs.MultiBuildingParkingLotRequestDTO;
import DTOs.MultipBuildingParkingLotResponseDTO;
import Services.MultipBuildingParkingLotService;

public class MultiBuildingParkingLotController {

    private MultipBuildingParkingLotService multipBuildingParkingLotService;

    public MultiBuildingParkingLotController(MultipBuildingParkingLotService multipBuildingParkingLotService){
        this.multipBuildingParkingLotService=multipBuildingParkingLotService;
    }

    public MultipBuildingParkingLotResponseDTO getMultiBuildingParkingLot(MultiBuildingParkingLotRequestDTO multiBuildingParkingLotRequestDTO){
        return null;
    }
}
