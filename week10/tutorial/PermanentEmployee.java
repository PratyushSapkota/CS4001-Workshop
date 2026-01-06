package week10.tutorial;


public class PermanentEmployee extends Employee {

    private double da;

    public PermanentEmployee(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        this.da = basicSalary * 0.25;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + da;
    }
}