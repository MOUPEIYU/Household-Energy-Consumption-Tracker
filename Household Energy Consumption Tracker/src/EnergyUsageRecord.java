public class EnergyUsageRecord {

    // Private attributes to ensure data security (Encapsulation)
    private String recordDate;
    private double totalEnergyKwh;
    private double estimatedCost;

    // Public setter for recordDate
    public void setRecordDate(String date) {
        this.recordDate = date;
    }

    // Public getter for recordDate
    public String getRecordDate() {
        return this.recordDate;
    }

    // Public setter for totalEnergyKwh with basic validation
    public void setTotalEnergyKwh(double energy) {
        if (energy >= 0) {
            this.totalEnergyKwh = energy;
        } else {
            System.out.println("Error: Energy usage cannot be negative.");
        }
    }

    // Public getter for totalEnergyKwh
    public double getTotalEnergyKwh() {
        return this.totalEnergyKwh;
    }

    // Public setter for estimatedCost
    public void setEstimatedCost(double cost) {
        if (cost >= 0) {
            this.estimatedCost = cost;
        } else {
            System.out.println("Error: Cost cannot be negative.");
        }
    }

    // Public getter for estimatedCost
    public double getEstimatedCost() {
        return this.estimatedCost;
    }

    /**
     * Temporary main method for individual testing.
     */
    public static void main(String[] args) {
        // 1. Create an object of EnergyUsageRecord
        EnergyUsageRecord testRecord = new EnergyUsageRecord();

        // 2. Test the setter methods
        testRecord.setRecordDate("2026-06-21");
        testRecord.setTotalEnergyKwh(150.5);
        testRecord.setEstimatedCost(45.15);

        // 3. Test the getter methods and print the expected output
        System.out.println("--- Testing EnergyUsageRecord Class ---");
        System.out.println("Date: " + testRecord.getRecordDate());
        System.out.println("Total Energy: " + testRecord.getTotalEnergyKwh() + " kWh");
        System.out.println("Estimated Cost: $" + testRecord.getEstimatedCost());
        System.out.println("---------------------------------------");
    }
}