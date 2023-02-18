package DTOs;

import Models.Ticket;

public class TicketResponseDTO {
    private Ticket ticket;
    private String message;

    public TicketResponseDTO(Ticket ticket, String message) {
        this.ticket = ticket;
        this.message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getMessage() {
        return message;
    }
}
