package week4.workshop;

import java.util.Scanner;

public class GpaToGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "aryan";
        String name2 = name.toUpperCase();
        System.out.println(name2);

        System.out.println("Enter a gpa: ");
        float gpa = sc.nextFloat();

        if (gpa >= 3.6 && gpa <= 4) {
            System.out.println("A+");
        } else if (gpa >= 3.2 && gpa <= 3.5) {
            System.out.println("A");
        } else if (gpa >= 2.8 && gpa == 3.1) {
            System.out.println("B+");
        } else if (gpa >= 2.2 && gpa == 2.7) {
            System.out.println("B");
        } else if (gpa >= 0 && gpa< 2.2) {
            System.out.println("fail");
        } else {
            System.out.println("Invalid gpa range");
        }
    }
}