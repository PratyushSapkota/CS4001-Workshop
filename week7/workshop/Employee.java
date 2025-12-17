package week7.workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{

    String test = "hello";
    int id;
    String name;
    float salary;

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Aryan";
        emp1.salary = 6000;

        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.name = "Sethi";
        emp2.salary = 3000;

        Employee emp3 = new Employee();
        emp3.id = 3;
        emp3.name = "Vicky";
        emp3.salary = 9000;


        if (emp1.salary > emp2.salary && emp1.salary > emp3.salary) {
            System.out.println(emp1.name + " has highest salary of " + emp1.salary);
        }
        else if (emp2.salary > emp1.salary && emp2.salary > emp3.salary) {
            System.out.println(emp2.name + " has highest salary of " + emp2.salary);
        }
        else {
            System.out.println(emp3.name + " has highest salary of " + emp3.salary);
        }
    }
}