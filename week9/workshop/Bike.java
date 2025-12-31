package week9.workshop;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle {
    private float engineCapacity;

    public Bike(int vehicleId, String brandName, double basePrice, float engineCapacity) {
        super(vehicleId, brandName, basePrice);
        this.engineCapacity = engineCapacity;
    }

    public double calculateFinalPrice() {
        return getBasePrice() + calculateTax();
    }
}