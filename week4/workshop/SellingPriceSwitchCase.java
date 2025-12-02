package week4.workshop;
import java.util.Scanner;


public class SellingPriceSwitchCase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marked price: ");
        float markedPrice = sc.nextFloat();

        System.out.println("Enter category char: ");
        char category = sc.next().charAt(0);

        float sellingPrice = 0;

        switch (category) {
            case 'A':
                sellingPrice = markedPrice - (markedPrice * 0.6f);
                break;
            case 'B':
                sellingPrice = markedPrice - (markedPrice * 0.4f);
                break;
            case 'C':
                sellingPrice = markedPrice - (markedPrice * 0.2f);
                break;
            case 'D':
                sellingPrice = markedPrice - (markedPrice * 0.1f);
                break;
            default:
                System.out.println("Invalid category char");

        }

        System.out.println(sellingPrice + " is your selling price");
    }
}