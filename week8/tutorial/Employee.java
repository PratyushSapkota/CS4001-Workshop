package week8.tutorial;

public class Employee {
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private double salary;
    private static String companyName = "ING";


    public Employee(int id, String name, String address, long phoneNumber, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void display() {
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("salary: " + this.salary);
        System.out.println("address: " + this.address);
        System.out.println("phoneNumber: " + this.phoneNumber);
        System.out.println("companyName: " + companyName);
    }

    public double getSalary() {
        return this.salary;
    }
    public void work(String position) {

    }

    public int getId() {
        return id;
    }
}