package week4.workshop;

import java.util.Scanner;


public class SellingPriceIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marked price: ");
        float markedPrice = sc.nextFloat();

        System.out.println("Enter category char: ");
        char category = sc.next().charAt(0);

        float discount = 0f;

        if (category == 'A') {
            discount = 0.6f;
        } else if (category == 'B') {
            discount = 0.4f;
        } else if (category == 'C') {
            discount = 0.2f;
        } else if (category == 'D') {
            discount = 0.1f;
        } else {
            System.out.println("Invalid category char, (A-D)");
            return;
        }
        float sellingPrice = markedPrice - (markedPrice * discount);
        System.out.println("Selling price is: " + sellingPrice);
    }
}