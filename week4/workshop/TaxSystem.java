package week4.workshop;


import java.util.Scanner;

public class TaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income: ");
        float income = sc.nextFloat();

        float tax = 0;
        if (income <= 500000) {
            tax = income * 0.01f;
        } else if (income >= 500001 && income <= 700000) {
            tax = 5000 + ((income - 500000) * 0.1f);
        } else if (income >= 700001 && income <= 1000000) {
            tax = 15000 + ((income - 700000) * 0.2f);
        } else if (income >= 1000001 && income <= 2000000) {
            tax = 35000 + ((income - 1000000) * 0.3f);
        } else if (income >= 2000001 && income <= 5000000) {
            tax = 335000 + ((income - 2000000) * 0.36f);
        } else if (income > 500000) {
            tax = 1135000 + ((income - 5000000) * 0.39f);
        }


        System.out.println("Your total tax is: " + tax);

    }
}