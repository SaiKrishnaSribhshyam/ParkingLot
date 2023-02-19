package Services;

import Models.*;
import Repo.ReceiptRepo;
import Repo.TicketRepo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class ReceiptGenerationService {
    private TicketRepo ticketRepo;
    private ReceiptRepo receiptRepo;

    public ReceiptGenerationService(TicketRepo ticketRepo,ReceiptRepo receiptRepo){
        this.ticketRepo=ticketRepo;
        this.receiptRepo=receiptRepo;
    }
    public Receipt generateReceipt(ParkingLot parkingLot, Vehicle vehicle) {
        Ticket ticket=ticketRepo.getTicket(vehicle);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        String exitDateTime=simpleDateFormat.format(Calendar.getInstance().getTime());
        double feeAmount=parkingLot.getParkingLotFeeModel().calculateFee(parkingLot.getParkingLotType(),ticket,exitDateTime);
        Receipt receipt=new Receipt(ticket.getEntryDateTime(),exitDateTime,feeAmount);
        ticket.getParkingSpot().setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
        receiptRepo.addReceipt(vehicle,receipt);
        return receipt;
    }
}
