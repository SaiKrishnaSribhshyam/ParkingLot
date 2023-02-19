package Tests;

import DTOs.*;
import Exceptions.NoAvailalbeParkingSpotException;
import Models.*;
import Services.AssignParkingSpotService;
import Services.ParkingAreaService;
import Services.ReceiptGenerationService;
import Strategies.SlabFeeModelStrategy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class OpenSpaceParkingLotTest {
    private SingletonRepo singletonRepo;
    public OpenSpaceParkingLotTest(SingletonRepo singletonRepo){
        this.singletonRepo=singletonRepo;
    }
    public void testOpenSpaceParkingLot(String filename,int testcases) {
        FileReader fileReader=null;
        Properties props=null;
        try {
            fileReader = new FileReader(filename);
            props = new Properties();
            props.load(fileReader);
        }
        catch(FileNotFoundException E){
            System.out.println("File reading Exception");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
        for(int i=1;i<=testcases;i++){
            String testcase="TestCase"+String.valueOf(i);
            System.out.println("-------------------"+testcase+"-------------------");
            String[] testcaseStrings= props.getProperty(testcase).split("\\|");
            String[] parkingLotMetadata=testcaseStrings[0].split(",");
            String[] parkingLotAddressArray=parkingLotMetadata[4].split(";");
            Address parkingLotAddress=new Address(parkingLotAddressArray[0],parkingLotAddressArray[1],parkingLotAddressArray[2]);
            ParkingLotType parkingLotType=ParkingLotType.valueOf(parkingLotMetadata[0]);
            int bikeParkingCapacity=Integer.valueOf(parkingLotMetadata[1]);
            int lmvParkingCapacity=Integer.valueOf(parkingLotMetadata[2]);
            int hmvParkingCapacity=Integer.valueOf(parkingLotMetadata[3]);
            OpenSpaceParkingLotRequestDTO openSpaceParkingLotRequestDTO=new OpenSpaceParkingLotRequestDTO(parkingLotType,bikeParkingCapacity,lmvParkingCapacity,hmvParkingCapacity,singletonRepo.parkingLotFeeModel,parkingLotAddress);
            OpenSpaceParkingLotResponseDTO openSpaceParkingLotResponseDTO= singletonRepo.openSpaceParkingLotController.getOpenSpaceParkingLot(openSpaceParkingLotRequestDTO);
            System.out.println(parkingLotMetadata[0]+" creation:"+openSpaceParkingLotResponseDTO.getStatus());
            ParkingLot openSpaceParkingLot=openSpaceParkingLotResponseDTO.getOpenSpaceParkingLot();
            int length=testcaseStrings.length;
            for(int j=1;j<length;j++){
                String[] parkingActionMetaData=testcaseStrings[j].split(",");
                if(parkingActionMetaData[0].equals("PARK")){
                    Vehicle vehicle=new Vehicle(Integer.valueOf(parkingActionMetaData[2]),VehicleType.valueOf(parkingActionMetaData[1]));
                    System.out.println("Parking "+vehicle);
                    TicketRequestDTO ticketRequestDTO=new TicketRequestDTO(openSpaceParkingLot,vehicle);
                    TicketResponseDTO ticketResponseDTO=null;
                    try{
                        ticketResponseDTO=singletonRepo.ticketController.getTicket(ticketRequestDTO);
                        System.out.println(ticketResponseDTO.getTicket());
                    }
                    catch(NoAvailalbeParkingSpotException e){
                        System.out.println("Space not avaialble");
                    }
                }
                else if(parkingActionMetaData[0].equals("UNPARK")){
                    Vehicle vehicle=new Vehicle(Integer.valueOf(parkingActionMetaData[2]),VehicleType.valueOf(parkingActionMetaData[1]));
                    System.out.println("Un-Parking "+vehicle);
                    int days=Integer.valueOf(parkingActionMetaData[3]);
                    int hours=Integer.valueOf(parkingActionMetaData[4]);
                    int mins=Integer.valueOf(parkingActionMetaData[5]);
                    //update entry time stamp as per test case
                    updateTicketStartDateTime(vehicle,days,hours,mins);
                    ReceiptRequestDTO receiptRequestDTO=new ReceiptRequestDTO(openSpaceParkingLot,vehicle);
                    ReceiptResponseDTO receiptResponseDTO=singletonRepo.receiptController.getReceipt(receiptRequestDTO);
                    System.out.println(receiptResponseDTO.getReceipt());
                }
                else
                    System.out.println("invalid action");
            }
        }


    }

    private void updateTicketStartDateTime(Vehicle vehicle, int days, int hours, int mins) {
        Ticket ticket=singletonRepo.ticketRepo.getTicket(vehicle);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,-days);
        calendar.add(Calendar.HOUR,-hours);
        calendar.add(Calendar.MINUTE,-mins);
        ticket.setEntryDateTime(simpleDateFormat.format(calendar.getTime()));
    }

}