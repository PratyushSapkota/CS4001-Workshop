package week7.workshop;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop {
    String brand;
    int ram;
    float price;

    void checkRequirement() {
        if (ram > 8) {
            System.out.println(brand + " has ram of " + ram + "gb.");
        }
    }

    public static void main(String[] args) {
        Laptop asus = new Laptop();
        asus.brand = "Asus";
        asus.ram = 16;
        asus.price = 65000;

        Laptop mac = new Laptop();
        mac.brand = "MacBook";
        mac.ram = 8;
        mac.price = 120000;

        Laptop dell = new Laptop();
        dell.brand = "Dell";
        dell.ram = 12;
        dell.price = 70000;

        asus.checkRequirement();
        mac.checkRequirement();
        dell.checkRequirement();
    }
}