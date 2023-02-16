
import Models.FeeSlab;
import Models.ParkingLotType;
import Models.VehicleType;
import Strategies.FeeModelFactory;
import Tests.OpenSpaceParkingLotTest;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        OpenSpaceParkingLotTest openSpaceParkingLotTest=new OpenSpaceParkingLotTest();
        openSpaceParkingLotTest.testOpenSpaceParkingLot();

        List<FeeSlab> feeSlabList= FeeModelFactory.getFeeSlabs(ParkingLotType.MallParkingLot, VehicleType.BUS);
    }
}

//C:\Users\Sony\IdeaProjects\ParkingLot\src\Static\Feeslabs.properties