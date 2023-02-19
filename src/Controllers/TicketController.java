package Controllers;

import DTOs.TicketRequestDTO;
import DTOs.TicketResponseDTO;
import Models.ParkingArea;
import Models.Ticket;
import Models.VehicleType;
import Services.AssignParkingSpotService;
import Services.ParkingLotService;

public class TicketController {
    private AssignParkingSpotService assignParkingSpotService;
    private ParkingLotService parkingLotService;
    public TicketController(AssignParkingSpotService assignParkingSpotService,ParkingLotService parkingLotService){
        this.assignParkingSpotService=assignParkingSpotService;
        this.parkingLotService=parkingLotService;
    }

    public TicketResponseDTO getTicket(TicketRequestDTO ticketRequestDTO){
        VehicleType vehicleType= ticketRequestDTO.getVehicle().getVehicleType();
        ParkingArea avaialbleParkingArea=parkingLotService.getnextAvailableParkingArea(ticketRequestDTO.getParkingLot(), vehicleType);
        Ticket ticket=assignParkingSpotService.assignSpot(avaialbleParkingArea,ticketRequestDTO.getVehicle());
        TicketResponseDTO ticketResponseDTO=new TicketResponseDTO(ticket,"Success");
        return ticketResponseDTO;
    }
}
