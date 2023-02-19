package Tests;

import Controllers.MultiBuildingParkingLotController;
import Controllers.OpenSpaceParkingLotController;
import Controllers.ReceiptController;
import Controllers.TicketController;
import Models.ParkingLotFeeModel;
import Repo.ParkingLotRepo;
import Repo.ReceiptRepo;
import Repo.TicketRepo;
import Services.*;
import Strategies.SlabFeeModelStrategy;

public class SingletonRepo {

    //Repo
    public ParkingLotRepo parkingLotRepo=new ParkingLotRepo();
    public TicketRepo ticketRepo=new TicketRepo();
    public ReceiptRepo receiptRepo=new ReceiptRepo();

    //services
    public AssignParkingSpotService assignParkingSpotService=new AssignParkingSpotService(ticketRepo);
    public ReceiptGenerationService receiptGenerationService=new ReceiptGenerationService(ticketRepo,receiptRepo);
    public ParkingAreaService parkingAreaService=new ParkingAreaService();
    public ParkingLotService parkingLotService=new ParkingLotService(parkingAreaService);
    public OpenSpaceParkingLotService openSpaceParkingLotService=new OpenSpaceParkingLotService(parkingLotRepo,parkingAreaService);
    public MultipBuildingParkingLotService multipBuildingParkingLotService=new MultipBuildingParkingLotService();

    //Controllers
    public OpenSpaceParkingLotController openSpaceParkingLotController=new OpenSpaceParkingLotController(openSpaceParkingLotService);
    public MultiBuildingParkingLotController multiBuildingParkingLotController=new MultiBuildingParkingLotController(multipBuildingParkingLotService);
    public TicketController ticketController=new TicketController(assignParkingSpotService,parkingLotService);
    public ReceiptController receiptController=new ReceiptController(receiptGenerationService);


    //Strategies
    public ParkingLotFeeModel parkingLotFeeModel=new SlabFeeModelStrategy();




}
