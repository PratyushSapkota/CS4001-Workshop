package week8.tutorial;


/**
 * Write a description of class CompanyApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompanyApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "employee 1", "address", 1239312L, 123.2);
        emp1.display();


        Employee emp2 = new Employee(2, "employee 2", "address", 124234329312L, 12243.2);
        double annualSalary = emp2.getSalary() * 12;
        System.out.println("Annual salary of emp2: " + annualSalary);

        emp1.work("Programmer");

    }
}