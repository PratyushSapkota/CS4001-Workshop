package week9.workshop;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employee {
    private int workingDays;

    public ContractEmployee(int employeeId, String employeeName, double basicSalary, int workingDays) {
        super(employeeId, employeeName, basicSalary);
        this.workingDays = workingDays;
    }

    public double calculateTotalSalary() {
        return getBasicSalary() * this.workingDays;
    }
}