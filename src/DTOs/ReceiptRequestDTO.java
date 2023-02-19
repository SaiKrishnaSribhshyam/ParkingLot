package DTOs;

import Models.ParkingLot;
import Models.Ticket;
import Models.Vehicle;

public class ReceiptRequestDTO {
    private ParkingLot parkinglot;
    private Vehicle vehicle;

    public ReceiptRequestDTO(ParkingLot parkinglot, Vehicle vehicle) {
        this.parkinglot = parkinglot;
        this.vehicle=vehicle;
    }

    public ParkingLot getParkinglot() {
        return parkinglot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
