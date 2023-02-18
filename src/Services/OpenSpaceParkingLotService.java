package Services;

import DTOs.OpenSpaceParkingLotRequestDTO;
import Models.OpenSpaceParkingLot;
import Repo.ParkingLotRepo;

public class OpenSpaceParkingLotService {
    private ParkingLotRepo parkingLotRepo;
    private ParkingAreaService parkingAreaService;
    public OpenSpaceParkingLotService(ParkingLotRepo parkingLotRepo,ParkingAreaService parkingAreaService){
        this.parkingLotRepo=parkingLotRepo;
        this.parkingAreaService=parkingAreaService;
    }

    public OpenSpaceParkingLot createOpenSpaceParkingLot(OpenSpaceParkingLotRequestDTO openSpaceParkingLotRequestDTO){
        OpenSpaceParkingLot openSpaceParkingLot=new OpenSpaceParkingLot(openSpaceParkingLotRequestDTO.getBikeParkingCapcity(),openSpaceParkingLotRequestDTO.getLMVParkingCapacity(),openSpaceParkingLotRequestDTO.getHMVParkingCapacity());
        openSpaceParkingLot.setParkingLotAddress(openSpaceParkingLotRequestDTO.getAddress());
        openSpaceParkingLot.setParkingLotFeeModel(openSpaceParkingLotRequestDTO.getSlabFeeModelStrategy());
        openSpaceParkingLot.setParkingLotType(openSpaceParkingLotRequestDTO.getParkingLotType());
        parkingAreaService.loadParkingArea(openSpaceParkingLot.getParkingArea());
        return openSpaceParkingLot;
    }

}
