package DTOs;

import Models.MultiBuildingParkingLot;

public class MultipBuildingParkingLotResponseDTO {
    private MultiBuildingParkingLot multiBuildingParkingLot;
    private String status;

    public MultiBuildingParkingLot getMultiBuildingParkingLot() {
        return multiBuildingParkingLot;
    }

    public void setMultiBuildingParkingLot(MultiBuildingParkingLot multiBuildingParkingLot) {
        this.multiBuildingParkingLot = multiBuildingParkingLot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
