package week4.workshop;


import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter gpa in float: ");
        float gpa = sc.nextFloat();

        System.out.println("Enter attendance percent in int: ");
        int attendance = sc.nextInt();

        System.out.println("Enter attitude score in int: ");
        int attitude = sc.nextInt();

        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not eligible due to attitude");
                }
            } else {
                System.out.println("Not eligible due to attendance");
            }
        } else {
            System.out.println("Not eligible due to gpa");
        }
    }
}