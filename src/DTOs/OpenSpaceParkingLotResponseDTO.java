package DTOs;

import Models.OpenSpaceParkingLot;

public class OpenSpaceParkingLotResponseDTO {
    private OpenSpaceParkingLot openSpaceParkingLot;
    private String status;

    public OpenSpaceParkingLot getOpenSpaceParkingLot() {
        return openSpaceParkingLot;
    }

    public void setOpenSpaceParkingLot(OpenSpaceParkingLot openSpaceParkingLot) {
        this.openSpaceParkingLot = openSpaceParkingLot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
