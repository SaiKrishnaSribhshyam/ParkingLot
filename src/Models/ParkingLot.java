package Models;

public class ParkingLot {
    private Address parkingLotAddress;
    private ParkingLotFeeModel parkingLotFeeModel;
    private ParkingLotType parkingLotType;

    public ParkingLotType getParkingLotType() {
        return parkingLotType;
    }

    public void setParkingLotType(ParkingLotType parkingLotType) {
        this.parkingLotType = parkingLotType;
    }

    public Address getParkingLotAddress() {
        return parkingLotAddress;
    }
    public void setParkingLotAddress(Address parkingLotAddress) {
        this.parkingLotAddress = parkingLotAddress;
    }
    public ParkingLotFeeModel getParkingLotFeeModel() {
        return parkingLotFeeModel;
    }

    public void setParkingLotFeeModel(ParkingLotFeeModel parkingLotFeeModel) {
        this.parkingLotFeeModel = parkingLotFeeModel;
    }

}
