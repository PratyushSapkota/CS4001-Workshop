package week8.workshop;


/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(40000);

        double grossSalary = employee.calculateGrossSalary();
        double basicSalary = employee.getBasicSalary();

        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Basic Salary: " + basicSalary );

    }
}