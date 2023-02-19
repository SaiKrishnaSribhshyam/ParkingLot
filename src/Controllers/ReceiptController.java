package Controllers;

import DTOs.ReceiptRequestDTO;
import DTOs.ReceiptResponseDTO;
import Models.Receipt;
import Services.ReceiptGenerationService;

public class ReceiptController {
    private ReceiptGenerationService receiptGenerationService;

    public ReceiptController(ReceiptGenerationService receiptGenerationService){
        this.receiptGenerationService=receiptGenerationService;
    }
    public ReceiptResponseDTO getReceipt(ReceiptRequestDTO receiptRequestDTO){
        Receipt receipt=receiptGenerationService.generateReceipt(receiptRequestDTO.getParkinglot(),receiptRequestDTO.getVehicle());
        ReceiptResponseDTO receiptResponseDTO=new ReceiptResponseDTO(receipt,"Success");
        return receiptResponseDTO;
    }
}
