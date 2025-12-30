package week9.tutorial;


public class Car {
    protected static int number_of_wheels = 4;
    protected float speed;
    protected String brand;
    protected String engineType;
    protected double price;
    
    public Car(float speed, String brand, String engineType, double price){
        this.speed = speed;
        this.brand = brand;
        this.engineType = engineType;
        this.price = price;
    }

    public void start() {
        System.out.println("Car starts");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("Car stopped");
    }

    public float getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void displayInfo() {
        System.out.println("brand name: " + getBrand());
        System.out.println("speed: " + getSpeed());
    }

}