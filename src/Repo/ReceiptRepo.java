package Repo;

import Models.Receipt;
import Models.Vehicle;

import java.util.HashMap;

public class ReceiptRepo {
    private HashMap<Vehicle, Receipt> receiptRepo;

    public ReceiptRepo(){
        receiptRepo=new HashMap<Vehicle,Receipt>();
    }

    public void addReceipt(Vehicle vehicle,Receipt receipt){
        receiptRepo.put(vehicle,receipt);
    }

    public Receipt getReceipt(Vehicle vehicle){
        if(receiptRepo.containsKey(vehicle))
            receiptRepo.get(vehicle);
        return null;
    }

    public void removeReceipt(Vehicle vehicle){
        receiptRepo.remove(vehicle);
    }
}
