package Services;

import Models.OpenSpaceParkingLot;
import Models.ParkingSpotStatus;
import Models.Receipt;
import Models.Ticket;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class ReceiptGenerationService {

    public Receipt generateReceipt(OpenSpaceParkingLot parkingLot,Ticket ticket) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        String exitDateTime=simpleDateFormat.format(Calendar.getInstance().getTime());
        double feeAmount=parkingLot.getParkingLotFeeModel().calculateFee(parkingLot.getParkingLotType(),ticket,exitDateTime);
        Receipt receipt=new Receipt(ticket.getEntryDateTime(),exitDateTime,feeAmount);
        ticket.getParkingSpot().setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
        return receipt;
    }
}
