package week7.workshop;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result {
    double subject1;
    double subject2;
    double subject3;

    Result(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    double percentage() {
        return ((subject1 + subject2 + subject3) / 3);
    }


    public static void main(String[] args) {
        Result student1Result = new Result(50, 75, 60);
        Result student2Result = new Result(40, 25, 90);
        Result student3Result = new Result(10, 43.3, 80);

        System.out.println("Student 1: " + student1Result.percentage());
        System.out.println("Student 2: " + student2Result.percentage());
        System.out.println("Student 3: " + student3Result.percentage());
    }

}