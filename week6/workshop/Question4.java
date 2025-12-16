package week6.workshop;


import java.util.Scanner;

/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int size = sc.nextInt();

        float[] marks = new float[size];

        float sum = 0;
        for (int i = 0; i < marks.length; i++){
            System.out.println("Enter the marks for " + (i+1));
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }
        float highest = marks[0];
        float lowest = marks[0];
        float avg = sum / marks.length;

        for (int j = 0; j < marks.length; j++){
            if (marks[j] > highest){
                highest = marks[j];
            }

            if (marks[j] < lowest){
                lowest = marks[j];
            }
        }

        System.out.println("The average marks is: " + avg);
        System.out.println("The highest marks is: " + highest);
        System.out.println("The lowest marks is: " + lowest);


    }
}