package week10.tutorial;

public class Employee {

    private int id;
    private String name;
    private double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary() {
        return this.basicSalary;
    }

    //overload
    public double calculateSalary(int extraHours) {
        return (this.basicSalary + extraHours * 500);
    }

    public void display() {
        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("basic salary: " + getBasicSalary());
    }

    @Override
    public String toString() {
        return ("id: " + getId() + ", name: " + getName() + ", basic salary: " + getBasicSalary());
    }
}
