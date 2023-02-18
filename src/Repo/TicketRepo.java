package Repo;

import Models.Ticket;
import Models.Vehicle;

import java.util.HashMap;

public class TicketRepo {
    private HashMap<Vehicle,Ticket> ticketRepo;

    public TicketRepo(){
        ticketRepo=new HashMap<Vehicle, Ticket>();
    }

    public void addTicket(Vehicle vehicle,Ticket ticket){
        ticketRepo.put(vehicle,ticket);
    }

    public Ticket getTicket(Vehicle vehicle){
        if(ticketRepo.containsKey(vehicle))
            return ticketRepo.get(vehicle);
        return null;
    }

    public void removeTicket(Vehicle vehicle){
        ticketRepo.remove(vehicle);
    }
}
