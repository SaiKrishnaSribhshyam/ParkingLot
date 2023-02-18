package Tests;

import Controllers.OpenSpaceParkingLotController;
import Repo.ParkingLotRepo;
import Services.AssignParkingSpotService;
import Services.OpenSpaceParkingLotService;
import Services.ParkingAreaService;
import Services.ReceiptGenerationService;

public class SingletonRepo {
    //services
    public AssignParkingSpotService assignParkingSpotService=new AssignParkingSpotService();
    public ReceiptGenerationService receiptGenerationService=new ReceiptGenerationService();
    public ParkingAreaService parkingAreaService=new ParkingAreaService();
    public ParkingLotRepo parkingLotRepo=new ParkingLotRepo();
    public OpenSpaceParkingLotService openSpaceParkingLotService=new OpenSpaceParkingLotService(parkingLotRepo,parkingAreaService);

    //Controllers
    public OpenSpaceParkingLotController openSpaceParkingLotController=new OpenSpaceParkingLotController(openSpaceParkingLotService);

}
