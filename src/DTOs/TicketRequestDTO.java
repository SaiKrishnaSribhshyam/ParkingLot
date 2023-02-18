package DTOs;

import Models.ParkingLot;
import Models.Vehicle;

public class TicketRequestDTO {
    private ParkingLot parkingLot;
    private Vehicle vehicle;

    public TicketRequestDTO(ParkingLot parkingLot, Vehicle vehicle) {
        this.parkingLot = parkingLot;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }
}
