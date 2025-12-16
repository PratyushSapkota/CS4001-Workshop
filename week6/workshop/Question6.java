package week6.workshop;


import java.util.Scanner;

/**
 * Write a description of class Question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[2][2];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                System.out.println("Enter the marks of student " + (i + 1) + " for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " marks: ");
            for (int j = 0; j < marks[0].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[i][j]);
            }
        }


    }

}