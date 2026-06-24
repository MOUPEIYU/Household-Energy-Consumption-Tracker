/**
 * Parent class for all household electrical appliances, implement encapsulation
 */
public class Appliance {
    // Private encapsulated attributes
    private String name;
    private double powerRating; // Rated power in kilowatts (kW)
    private double usageDuration; // Daily usage time in hours (h)

    // Parameterized constructor
    public Appliance(String name, double powerRating, double usageDuration) {
        this.name = name;
        // Data validation: power cannot be negative
        if (powerRating < 0) {
            this.powerRating = 0;
        } else {
            this.powerRating = powerRating;
        }
        // Data validation: usage time cannot be negative
        if (usageDuration < 0) {
            this.usageDuration = 0;
        } else {
            this.usageDuration = usageDuration;
        }
    }

    // Getter method for appliance name
    public String getName() {
        return name;
    }

    // Getter method for power rating
    public double getPowerRating() {
        return powerRating;
    }

    // Getter method for usage duration
    public double getUsageDuration() {
        return usageDuration;
    }

    // Setter for appliance name
    public void setName(String name) {
        this.name = name;
    }

    // Setter with validation for power rating
    public void setPowerRating(double powerRating) {
        if (powerRating >= 0) {
            this.powerRating = powerRating;
        } else {
            System.out.println("Power rating cannot be negative, modification failed");
        }
    }

    // Setter with validation for usage duration
    public void setUsageDuration(double usageDuration) {
        if (usageDuration >= 0) {
            this.usageDuration = usageDuration;
        } else {
            System.out.println("Usage duration cannot be negative, modification failed");
        }
    }

    // Base method to calculate power consumption, to be overridden by subclasses for polymorphism
    public double calculateEnergyConsumption() {
        // Formula: Power × Usage Time = Total energy (kWh)
        return powerRating * usageDuration;
    }
}
