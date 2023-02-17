
import Models.FeeSlab;
import Models.ParkingLotType;
import Models.VehicleType;
import Strategies.SlabFeeModelFactory;
import Tests.OpenSpaceParkingLotTest;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        OpenSpaceParkingLotTest openSpaceParkingLotTest=new OpenSpaceParkingLotTest();
        openSpaceParkingLotTest.testOpenSpaceParkingLot();

        List<FeeSlab> feeSlabList= SlabFeeModelFactory.getFeeSlabs(ParkingLotType.MallParkingLot, VehicleType.BUS);
    }
}

//C:\Users\Sony\IdeaProjects\ParkingLot\src\Static\FeeSlabs.properties