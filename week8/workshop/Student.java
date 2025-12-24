package week8.workshop;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName = "Islington";

    public Student(int id, String name, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("College name: " + collegeName);
    }


}