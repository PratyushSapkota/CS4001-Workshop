package week9.workshop;


public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car(1, "toyota", 4500000, 4, "petrol");
        System.out.println("Car details");
        System.out.println("Final Price: " + car.calculateFinalPrice());

        Bike bike = new Bike(2, "honda", 300000, 2);
        System.out.println("Car details");
        bike.displayInfo();
        System.out.println(bike.calculateFinalPrice());
    }

}