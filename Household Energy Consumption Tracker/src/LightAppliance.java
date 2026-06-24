/**
 * Subclass for lighting appliances, inherits from Appliance parent class
 * Unique attribute: check if the light is LED type
 * Override energy calculation method: LED lights save energy with 0.6 discount factor
 */
public class LightAppliance extends Appliance {
    // Unique attribute for lighting equipment
    private boolean isLED;

    // Subclass constructor, call parent constructor first via super()
    public LightAppliance(String name, double powerRating, double usageDuration, boolean isLED) {
        super(name, powerRating, usageDuration);
        this.isLED = isLED;
    }

    // Getter for LED status
    public boolean getIsLED() {
        return isLED;
    }

    // Setter for LED status
    public void setIsLED(boolean LED) {
        this.isLED = LED;
    }

    /**
     * Override parent energy calculation method (core of polymorphism)
     * LED lights apply 40% energy discount, normal bulbs use full consumption
     * @return Actual total energy consumption in kWh
     */
    @Override
    public double calculateEnergyConsumption() {
        // Call base consumption calculation from parent class
        double baseConsume = super.calculateEnergyConsumption();
        if (isLED) {
            // LED light reduces energy consumption by multiplying 0.6
            return baseConsume * 0.6;
        } else {
            // Traditional incandescent lamp without discount
            return baseConsume;
        }
    }
}
