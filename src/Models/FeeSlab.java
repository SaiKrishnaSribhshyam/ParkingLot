package Models;

public class FeeSlab {
    private int start;
    private int end;
    private SlabType slabType;
    private double amount;

    public FeeSlab(int start, int end, SlabType slabType, double amount) {
        this.start = start;
        this.end = end;
        this.slabType = slabType;
        this.amount = amount;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public SlabType getSlabType() {
        return slabType;
    }

    public void setSlabType(SlabType slabType) {
        this.slabType = slabType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
