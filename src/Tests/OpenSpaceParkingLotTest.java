package Tests;

import Models.OpenSpaceParkingLot;
import Models.ParkingLotFeeModel;
import Models.Ticket;
import Models.VehicleType;
import Services.AssignParkingSpotService;
import Services.ReceiptGenerationService;
import Strategies.SlabFeeModelStrategy;

public class OpenSpaceParkingLotTest {
    AssignParkingSpotService assignParkingSpotService=new AssignParkingSpotService();
    ReceiptGenerationService receiptGenerationService=new ReceiptGenerationService();

    public void testOpenSpaceParkingLot(){
        ParkingLotFeeModel parkingLotFeeModel=new SlabFeeModelStrategy();
        OpenSpaceParkingLot parkingLot=new OpenSpaceParkingLot(100,50,50);
        parkingLot.setParkingLotFeeModel(parkingLotFeeModel);
        Ticket ticket=assignParkingSpotService.assignSpot(parkingLot, VehicleType.CAR);
        System.out.println(ticket);
        System.out.println(receiptGenerationService.generateReceipt(parkingLot,ticket));
    }

}