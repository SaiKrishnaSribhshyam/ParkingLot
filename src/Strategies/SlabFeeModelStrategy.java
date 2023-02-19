package Strategies;

import Models.*;
import Models.VehicleType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SlabFeeModelStrategy implements ParkingLotFeeModel {

    @Override
    public double calculateFee(ParkingLotType parkingLotType,Ticket ticket, String exitDateTime) {
        VehicleType vehicleType=ticket.getParkingSpot().getVehicleType();
        List<FeeSlab> feeSlabList= SlabFeeModelFactory.getFeeSlabs(parkingLotType,vehicleType);
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

        long durationMillis=(exitTime.getTime()-entryTime.getTime());
        //System.out.println("duration"+durationMillis);
        int durationHours=(int)durationMillis/(60*60*1000);
        int remainingMins=(int)(durationMillis/(60*1000))%60;
        int durationdays=(int)durationHours/24;
        int remainingHours=(int)durationHours%24;
        if(remainingMins>0)
            durationHours++;


        if(durationdays>0)
            amount+=calculatePerDayFee(feeSlabList,durationdays);

        if(amount>0)
            amount+=calculatePerHourFee(feeSlabList,remainingHours);
        else
            amount+=calculatePerHourFee(feeSlabList,durationHours);

        return amount;
    }

    private double calculatePerHourFee(List<FeeSlab> feeSlabList, int hours) {
        double amount=0d;
        for(FeeSlab slab:feeSlabList){
            if(slab.getSlabType()==SlabType.PER_HOUR){
                if(slab.getEnd()<hours)
                    amount+=(slab.getEnd()-slab.getStart())*slab.getAmount();
                else {
                    amount += (hours - slab.getStart()) * slab.getAmount();
                    break;
                }
            }
            else if(slab.getSlabType()==SlabType.FLAT_RATE) {
                if(slab.getEnd()<hours)
                    amount += slab.getAmount();
                else {
                    amount += slab.getAmount();
                    break;
                }
            }

        }
        return amount;
    }

    private double calculatePerDayFee(List<FeeSlab> feeSlabList, int days) {
        double amount=0d;
        for(FeeSlab slab:feeSlabList) {
            if (slab.getSlabType() == SlabType.PER_DAY) {
                if (slab.getEnd() < days)
                    amount += (slab.getEnd() - slab.getStart()) * slab.getAmount();
                else {
                    amount += (days - slab.getStart()) * slab.getAmount();
                    break;
                }
            }
        }
        return amount;
    }


}
