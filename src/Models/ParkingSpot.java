package Models;

public class ParkingSpot {
    private Integer id;
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    public ParkingSpot(Integer id, VehicleType vehicleType){
        this.id=id;
        this.vehicleType=vehicleType;
        this.parkingSpotStatus=ParkingSpotStatus.AVAILABLE;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", vehicleType=" + vehicleType +
                ", parkingSpotStatus=" + parkingSpotStatus +
                '}';
    }
}
