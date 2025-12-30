package week9.tutorial;


/**
 * Write a description of class ElectricCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricCar extends Car {

    private float batteryCapacity;

    public ElectricCar(float speed, String brand, String engineType, double price, float batteryCapacity){
        super(speed, brand, engineType, price);
        this.batteryCapacity = batteryCapacity;
    }
    public float getBatteryCapacity() {
        return batteryCapacity;
    }


}