package Tests;

import Models.*;
import Services.AssignParkingSpotService;
import Services.ParkingAreaService;
import Services.ReceiptGenerationService;
import Strategies.SlabFeeModelStrategy;

public class OpenSpaceParkingLotTest {
    private SingletonRepo singletonRepo;
    public OpenSpaceParkingLotTest(SingletonRepo singletonRepo){
        this.singletonRepo=singletonRepo;
    }
    public void testOpenSpaceParkingLot(){
        //testcase1
        ParkingLotFeeModel parkingLotFeeModel=new SlabFeeModelStrategy();
        OpenSpaceParkingLot parkingLot=new OpenSpaceParkingLot(100,50,50);
        singletonRepo.parkingAreaService.loadParkingArea(parkingLot.getParkingArea());
        parkingLot.setParkingLotFeeModel(parkingLotFeeModel);
        parkingLot.setParkingLotType(ParkingLotType.MallParkingLot);
        Ticket ticket=singletonRepo.assignParkingSpotService.assignSpot(parkingLot.getParkingArea(), VehicleType.CAR);
        ticket.setEntryDateTime("16-Feb-2023 19:15:00");
        System.out.println(ticket);
        System.out.println(singletonRepo.receiptGenerationService.generateReceipt(parkingLot,ticket));

        //testcase2
        parkingLot.setParkingLotType(ParkingLotType.StadiumParkingLot);
        ticket=singletonRepo.assignParkingSpotService.assignSpot(parkingLot.getParkingArea(), VehicleType.SUV);
        ticket.setEntryDateTime("16-Feb-2023 12:30:00");
        System.out.println(ticket);
        System.out.println(singletonRepo.receiptGenerationService.generateReceipt(parkingLot,ticket));


        //testcase3
        parkingLot.setParkingLotType(ParkingLotType.AirportParkingLot);
        ticket=singletonRepo.assignParkingSpotService.assignSpot(parkingLot.getParkingArea(), VehicleType.MOTORCYCLE);
        ticket.setEntryDateTime("15-Feb-2023 11:00:00");
        System.out.println(ticket);
        System.out.println(singletonRepo.receiptGenerationService.generateReceipt(parkingLot,ticket));

    }

}