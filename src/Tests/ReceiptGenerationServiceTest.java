package Tests;

import Models.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReceiptGenerationServiceTest {
    private SingletonRepo singletonRepo;
    public ReceiptGenerationServiceTest(SingletonRepo singletonRepo){
        this.singletonRepo=singletonRepo;
    }

    public void test(){
        OpenSpaceParkingLot parkinglot=new OpenSpaceParkingLot(10,10,0);
        parkinglot.setParkingLotFeeModel(singletonRepo.parkingLotFeeModel);
        parkinglot.setParkingLotType(ParkingLotType.MallParkingLot);
        ParkingArea parkingArea=parkinglot.getParkingArea();
        singletonRepo.parkingAreaService.loadParkingArea(parkingArea);
        parkinglot.setParkingArea(parkingArea);
        Vehicle vehicle=new Vehicle(100, VehicleType.CAR);
        singletonRepo.assignParkingSpotService.assignSpot(parkingArea,vehicle);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.HOUR,-1);
        cal.add(Calendar.MINUTE,-30);
        singletonRepo.ticketRepo.getTicket(vehicle).setEntryDateTime(simpleDateFormat.format(cal.getTime()));
        Receipt receipt=singletonRepo.receiptGenerationService.generateReceipt(parkinglot,vehicle);
        if(receipt.getFeeAmount()==40)
            System.out.println("ReceiptGeneratorServiceTest: Success");
        else
            System.out.println("ReceiptGeneratorServiceTest: Failed");
    }
}
