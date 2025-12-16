package week6.workshop;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of districts: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("District name: ");
            names[i] = sc.next();
        }

        System.out.println("Printing with numbered list: ");
        for (int j = 0; j < size; j++) {
            System.out.println((j + 1) + ". " + names[j]);
        }


    }
}