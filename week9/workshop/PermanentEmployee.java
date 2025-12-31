package week9.workshop;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employee {
    private double houseRentAllowance;
    private double dearnessAllowance;

    public PermanentEmployee(int employeeId, String employeeName, double baseSalary, double houseRentAllowance, double dearnessAllowance) {
        super(employeeId, employeeName, baseSalary);
        this.houseRentAllowance = houseRentAllowance;
        this.dearnessAllowance = dearnessAllowance;
    }

    public double calculateTotalSalary() {
        return getBasicSalary() + houseRentAllowance + dearnessAllowance + calculateBonus();
    }
}