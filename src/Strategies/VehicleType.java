package Strategies;

enum VehicleType {
    MOTORCYCLE(30, 60, 100),
    CAR_SUV(60, 120, 200);

    private final double intervalFee1;
    private final double intervalFee2;
    private final double hourlyFee;

    VehicleType(double intervalFee1, double intervalFee2, double hourlyFee) {
        this.intervalFee1 = intervalFee1;
        this.intervalFee2 = intervalFee2;
        this.hourlyFee = hourlyFee;
    }

    public double calculate(double duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Duration cannot be negative.");
        }
        if (duration < 4) {
            return intervalFee1;
        } else if (duration < 12) {
            return intervalFee2;
        } else {
            double totalFee = intervalFee2;
            duration -= 12;
            totalFee += Math.ceil(duration) * hourlyFee;
            return totalFee;
        }
    }
}