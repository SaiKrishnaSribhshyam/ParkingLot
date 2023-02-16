package Models;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Ticket {
    private ParkingSpot parkingSpot;
    private String entryDateTime;
    //private final SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MMM-YYYY hh:mm:ss");
    public Ticket(ParkingSpot parkingSpot,String entryDateTime){
        this.parkingSpot=parkingSpot;
        this.entryDateTime=entryDateTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public String getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(String entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "parkingSpot=" + parkingSpot +
                ", entryDateTime='" + entryDateTime + '\'' +
                '}';
    }

}
