package week9.workshop;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle {

    private int numberOfDoors;
    private String fuelType;

    public Car(int vehicleId, String brandName, double basePrice, int numberOfDoors, String fuelType) {
        super(vehicleId, brandName, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public double calculateFinalPrice() {
        double basePrice = getBasePrice();
        double tax = calculateTax();
        double luxuryCharge = 0.05 * basePrice;
        return basePrice + tax + luxuryCharge;
    }
}