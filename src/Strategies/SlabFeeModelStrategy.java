package Strategies;

import Models.*;
import Models.VehicleType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SlabFeeModelStrategy implements ParkingLotFeeModel {

    @Override
    public double calculateFee(ParkingLotType parkingLotType,Ticket ticket, String exitDateTime) {
        VehicleType vehicleType=ticket.getParkingSpot().getVehicleType();
        List<FeeSlab> feeSlabList=FeeModelFactory.getFeeSlabs(parkingLotType,vehicleType);
        double amount=0d;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date entryTime=null;
        Date exitTime=null;
        try {
            entryTime= simpleDateFormat.parse(ticket.getEntryDateTime());
            exitTime= simpleDateFormat.parse(exitDateTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        long durationHours=(exitTime.getTime()-entryTime.getTime())/(60*60*1000);
        int days=(int)durationHours/24;
        int remainingHours=(int)durationHours%24;
        for(FeeSlab feeSlab:feeSlabList){
            double
        }
    }
}
