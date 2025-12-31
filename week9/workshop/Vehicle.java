package week9.workshop;


public class Vehicle {

    protected int vehicleId;


    protected String brandName;
    protected double basePrice;

    public Vehicle(int vehicleId, String brandName, double basePrice) {
        this.vehicleId = vehicleId;
        this.brandName = brandName;
        this.basePrice = basePrice;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void displayInfo() {
        System.out.println("Id: " + getVehicleId());
        System.out.println("Brand name: " + getBrandName());
        System.out.println("Price: " + getBasePrice());
    }

    public double calculateTax() {
        return 0.1 * getBasePrice();
    }

}
