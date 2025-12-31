package week9.workshop;


/**
 * Write a description of class CollegeApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeApp {
    public static void main(String[] args) {
        Staff staff = new Staff(1, "Aryan", 0, 15, 40);
        System.out.println("Staff salary: ");
        System.out.println(staff.calculateAnnualSalary());

        Teacher teacher = new Teacher(2, "Aryan", 40000, "Programming", 5000);
        System.out.println("Teacher salary: ");
        System.out.println(teacher.calculateAnnualSalary());
    }
}