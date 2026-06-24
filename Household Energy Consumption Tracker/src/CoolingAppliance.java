public class CoolingAppliance extends Appliance {
    // Unique attribute: user set cooling temperature
    private double temperatureSetting;

    // Parameterized constructor for cooling appliances
    public CoolingAppliance(String name, double powerRating, double usageDuration, double temperatureSetting) {
        super(name, powerRating, usageDuration);
        this.temperatureSetting = temperatureSetting;
    }

    // Getter for temperature setting value
    public double getTemperatureSetting() {
        return temperatureSetting;
    }

    // Setter to update cooling temperature
    public void setTemperatureSetting(double temp) {
        this.temperatureSetting = temp;
    }

    /**
     * Override energy consumption calculation to implement polymorphism
     * If temperature is below 22°C, cooling load increases, extra 20% power consumption
     */
    @Override
    public double calculateEnergyConsumption() {
        double baseConsume = super.calculateEnergyConsumption();
        // Low temperature setting causes higher energy cost
        if (temperatureSetting < 22) {
            return baseConsume * 1.2;
        } else {
            return baseConsume;
        }
    }
}
