package Models;

public interface ParkingLotFeeModel {
    public double calculateFee(ParkingLotType parkingLotType,Ticket ticket,String exitDateTime);
}
