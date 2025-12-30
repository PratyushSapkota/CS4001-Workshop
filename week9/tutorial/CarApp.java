package week9.tutorial;


/**
 * Write a description of class CarApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarApp {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar(
                40.4f,
                "Tesla",
                "single electric motor",
                50000,
                8000
        );

        e.displayInfo();
        e.start();
        e.stop();

        System.out.println(ElectricCar.number_of_wheels);
        
        
        PetrolCar p = new PetrolCar(60f, "Toyota", "v8", 60000, 40);
        p.displayInfo();
    }
}