package Controllers;

import DTOs.OpenSpaceParkingLotRequestDTO;
import DTOs.OpenSpaceParkingLotResponseDTO;
import Models.OpenSpaceParkingLot;
import Services.OpenSpaceParkingLotService;

public class OpenSpaceParkingLotController {
    private OpenSpaceParkingLotService openSpaceParkingLotService;

    public OpenSpaceParkingLotController(OpenSpaceParkingLotService openSpaceParkingLotService){
        this.openSpaceParkingLotService=openSpaceParkingLotService;
    }

    public OpenSpaceParkingLotResponseDTO getOpenSpaceParkingLot(OpenSpaceParkingLotRequestDTO openSpaceParkingLotRequestDTO){
       OpenSpaceParkingLot openSpaceParkingLot=openSpaceParkingLotService.createOpenSpaceParkingLot(openSpaceParkingLotRequestDTO);
       OpenSpaceParkingLotResponseDTO openSpaceParkingLotResponseDTO=new OpenSpaceParkingLotResponseDTO();
       if(openSpaceParkingLot!=null) {
           openSpaceParkingLotResponseDTO.setOpenSpaceParkingLot(openSpaceParkingLot);
           openSpaceParkingLotResponseDTO.setStatus("Success");
       }
       else
           openSpaceParkingLotResponseDTO.setStatus("Failed");
       return openSpaceParkingLotResponseDTO;
    }
}
