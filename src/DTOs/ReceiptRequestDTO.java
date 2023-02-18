package DTOs;

import Models.ParkingLot;
import Models.Ticket;

public class ReceiptRequestDTO {
    private ParkingLot parkinglot;
    private Ticket ticket;

    public ReceiptRequestDTO(ParkingLot parkinglot, Ticket ticket) {
        this.parkinglot = parkinglot;
        this.ticket = ticket;
    }

    public ParkingLot getParkinglot() {
        return parkinglot;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
