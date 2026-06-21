
public class Appliance {
    // Private attributes for encapsulation
    private String name;
    private double powerRating;      // watts
    private double usageDuration;    // hours

    // Constructor
    public Appliance(String name, double powerRating, double usageDuration) {
        setName(name);
        setPowerRating(powerRating);
        setUsageDuration(usageDuration);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown Appliance";
        } else {
            this.name = name;
        }
    }

    // Getter for power rating
    public double getPowerRating() {
        return powerRating;
    }

    // Setter for power rating with validation
    public void setPowerRating(double powerRating) {
        if (powerRating < 0) {
            this.powerRating = 0;
        } else {
            this.powerRating = powerRating;
            
        }
    }

    // Getter for usage duration
    public double getUsageDuration() {
        return usageDuration;
    }

    // Setter for usage duration with validation
    public void setUsageDuration(double usageDuration) {
        if (usageDuration < 0) {
            this.usageDuration = 0;
        } else {
            this.usageDuration = usageDuration;
        }
    }

    // Calculate energy consumption in kWh
    public double calculateEnergyConsumption() {
        return (powerRating * usageDuration) / 1000;
    }

    // Display appliance details
    public void displayInfo() {
        System.out.println("Appliance Name: " + name);
        System.out.println("Power Rating: " + powerRating + " watts");
        System.out.println("Usage Duration: " + usageDuration + " hours");
        System.out.println("Energy Consumption: " + calculateEnergyConsumption() + " kWh");
    }
}
