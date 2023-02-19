
import Models.FeeSlab;
import Models.ParkingLotType;
import Models.VehicleType;
import Strategies.SlabFeeModelFactory;
import Tests.OpenSpaceParkingLotTest;
import Tests.SingletonRepo;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SingletonRepo singletonRepo=new SingletonRepo();
        OpenSpaceParkingLotTest openSpaceParkingLotTest=new OpenSpaceParkingLotTest(singletonRepo);
        String str=new String(".\\src\\Static\\TestCase.properties");
        try {
            openSpaceParkingLotTest.testOpenSpaceParkingLot(str, 4);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        List<FeeSlab> feeSlabList= SlabFeeModelFactory.getFeeSlabs(ParkingLotType.MallParkingLot, VehicleType.BUS);
    }
}

//C:\Users\Sony\IdeaProjects\ParkingLot\src\Static\FeeSlabs.properties