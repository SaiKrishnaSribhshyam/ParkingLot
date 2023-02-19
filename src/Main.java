
import Models.FeeSlab;
import Models.ParkingLotType;
import Models.VehicleType;
import Services.ReceiptGenerationService;
import Strategies.SlabFeeModelFactory;
import Tests.AssignParkingSpotServiceTest;
import Tests.OpenSpaceParkingLotTest;
import Tests.ReceiptGenerationServiceTest;
import Tests.SingletonRepo;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SingletonRepo singletonRepo=new SingletonRepo();

        //unit tests for services
        AssignParkingSpotServiceTest assignParkingSpotServiceTest=new AssignParkingSpotServiceTest(singletonRepo);
        ReceiptGenerationServiceTest receiptGenerationServiceTest=new ReceiptGenerationServiceTest(singletonRepo);
        assignParkingSpotServiceTest.test();
        receiptGenerationServiceTest.test();

        //Integration tests for ParkingLot testcases defined in Static/Testcase.properties
        OpenSpaceParkingLotTest openSpaceParkingLotTest=new OpenSpaceParkingLotTest(singletonRepo);
        String str=new String(".\\src\\Static\\TestCase.properties");
        openSpaceParkingLotTest.testOpenSpaceParkingLot(str, 4);


    }
}