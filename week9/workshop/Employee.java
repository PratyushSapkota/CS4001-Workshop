package week9.workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double basicSalary;


    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.employeeName);
        System.out.println("Id: " + this.employeeId);
        System.out.println("Base salary: " + this.basicSalary);
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateBonus() {
        return 0.1 * this.basicSalary;
    }
}