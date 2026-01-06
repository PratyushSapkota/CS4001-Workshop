package week10.tutorial;


/**
 * Write a description of class PayrollApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayrollApp {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Aryan", 50000);

        System.out.println(permanentEmployee);
        System.out.println(permanentEmployee.calculateSalary());
    }
}