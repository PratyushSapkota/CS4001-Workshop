package week8.workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;

    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary(){
        return 1.2 * this.basicSalary;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }
}