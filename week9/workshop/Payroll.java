package week9.workshop;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee(1, "Aryan", 40000, 400, 223);
        System.out.println("Permanent Employee");
        p.displayInfo();
        System.out.println("Final salary: " + p.calculateTotalSalary());

        ContractEmployee c = new ContractEmployee(2, "Aryan 2", 23333, 6);
        System.out.println("Contract employee");
        c.displayInfo();
        System.out.println("Final salary: " + c.calculateTotalSalary());
    }
}