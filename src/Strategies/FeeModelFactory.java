package Strategies;

import Models.FeeSlab;
import Models.ParkingLotType;
import Models.SlabType;
import Models.VehicleType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FeeModelFactory {

    private static Properties props=new Properties();

    public static List<FeeSlab> getFeeSlabs(ParkingLotType parkingLotType, VehicleType vehicleType){
        List<FeeSlab> feeSlabList=new ArrayList<FeeSlab>();
        try {
            FileReader fr=new FileReader(".\\src\\Static\\Feeslabs.properties");
            props.load(fr);
            String[] slabs=props.getProperty(String.valueOf(parkingLotType)+"_"+String.valueOf(vehicleType)).split("\\|");
            for(String slab:slabs){
                System.out.println(slab);
                String[] thisSlab=slab.split(",");
                FeeSlab feeSlab=new FeeSlab(Integer.valueOf(thisSlab[0]),Integer.valueOf(thisSlab[1]),SlabType.valueOf(thisSlab[3]),Double.valueOf(thisSlab[2]));
                feeSlabList.add(feeSlab);
            }
        } catch (Exception e) {
            System.out.println("Exception while opening FeeSlabs properrties file");
            e.printStackTrace();
        }
        return feeSlabList;
    }
}
