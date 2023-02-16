package Services;

import Models.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

public class AssignParkingSpotService {
    public Ticket assignSpot(OpenSpaceParkingLot parkingLot,VehicleType vehicleType) {
        ParkingSpot parkingSpot=getNextAvailableSpot(getListOfParkingSpots(parkingLot,vehicleType));
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Ticket ticket=new Ticket(parkingSpot, simpleDateFormat.format(Calendar.getInstance().getTime()));
        return ticket;
    }

    private List<ParkingSpot> getListOfParkingSpots(OpenSpaceParkingLot parkingLot, VehicleType vehicleType) {
        List<ParkingSpot> parkingSpotList=switch(vehicleType){
            case MOTORCYCLE,SCOOTER ->  parkingLot.getBikeParkingSpots();
            case CAR,SUV    -> parkingLot.getLmvParkingSpots();
            case BUS,TRUCK ->  parkingLot.getHmvParkingSpots();
        };
        return parkingSpotList;
    }

    private ParkingSpot getNextAvailableSpot(List<ParkingSpot> parkingSpotList) {
        int length=parkingSpotList.size();
        for(int i=0;i<length;i++){
            if(parkingSpotList.get(i).getParkingSpotStatus()==ParkingSpotStatus.AVAILABLE)
                return parkingSpotList.get(i);
        }
        return null;
    }

}
