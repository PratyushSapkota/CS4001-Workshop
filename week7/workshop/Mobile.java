package week7.workshop;


import java.util.List;

/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    String brand;
    float price;

    Mobile(String brand, float price ){
        this.brand = brand;
        this.price = price;
    }
    void isAffordable(){
        if (price < 20000){
            System.out.println(this.brand + " is affordable with price " + this.price);
        }
    }

    public static void main(String[] args) {
        Mobile iphone = new Mobile("apple", 70000);
        Mobile samsung = new Mobile("samsung", 40000);
        Mobile nothing = new Mobile("nothing", 10000);

        iphone.isAffordable();
        samsung.isAffordable();
        nothing.isAffordable();

    }

}