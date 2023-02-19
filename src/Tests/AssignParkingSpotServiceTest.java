package Tests;

import Models.ParkingArea;
import Models.ParkingSpotStatus;
import Models.Vehicle;
import Models.VehicleType;
import Services.AssignParkingSpotService;

public class AssignParkingSpotServiceTest {
    private SingletonRepo singletonRepo;

    public AssignParkingSpotServiceTest(SingletonRepo singletonRepo){
        this.singletonRepo=singletonRepo;
    }

    public void test(){
        ParkingArea parkingArea=new ParkingArea(10,10,0);
        singletonRepo.parkingAreaService.loadParkingArea(parkingArea);
        Vehicle vehicle=new Vehicle(100, VehicleType.CAR);
        singletonRepo.assignParkingSpotService.assignSpot(parkingArea,vehicle);
        if(parkingArea.getLmvParkingSpots().get(0).getParkingSpotStatus()== ParkingSpotStatus.OCCUPIED)
            System.out.println("AssignParkingSpotServiceTest: Success");
        else
            System.out.println("AssignParkingSpotServiceTest: Failed");
    }
}
