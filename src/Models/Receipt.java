package Models;

public class Receipt {
    private String entryDateTime;
    private String exitDateTime;
    private double feeAmount;
    public Receipt(String entryDateTime,String exitDateTime,double feeAmount){
        this.entryDateTime=entryDateTime;
        this.exitDateTime=exitDateTime;
        this.feeAmount=feeAmount;
    }

    public String getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(String entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public String getExitDateTime() {
        return exitDateTime;
    }

    public void setExitDateTime(String exitDateTime) {
        this.exitDateTime = exitDateTime;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "entryDateTime='" + entryDateTime + '\'' +
                ", exitDateTime='" + exitDateTime + '\'' +
                ", feeAmount=" + feeAmount +
                '}';
    }
}
