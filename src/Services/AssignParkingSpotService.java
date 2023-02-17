package Services;

import Models.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

public class AssignParkingSpotService {
    public Ticket assignSpot(ParkingArea parkingArea,VehicleType vehicleType) {
        ParkingSpot parkingSpot=getNextAvailableSpot(getListOfParkingSpots(parkingArea,vehicleType));

        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Ticket ticket=new Ticket(parkingSpot, simpleDateFormat.format(Calendar.getInstance().getTime()));
        return ticket;
    }

    private List<ParkingSpot> getListOfParkingSpots(ParkingArea parkingArea, VehicleType vehicleType) {
        List<ParkingSpot> parkingSpotList=switch(vehicleType){
            case MOTORCYCLE,SCOOTER ->  parkingArea.getBikeParkingSpots();
            case CAR,SUV    -> parkingArea.getLmvParkingSpots();
            case BUS,TRUCK ->  parkingArea.getHmvParkingSpots();
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
