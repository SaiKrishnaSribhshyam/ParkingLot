package DTOs;

import Models.Receipt;

public class ReceiptResponseDTO {
    private Receipt receipt;
    private String message;

    public ReceiptResponseDTO(Receipt receipt, String message) {
        this.receipt = receipt;
        this.message = message;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public String getMessage() {
        return message;
    }
}
