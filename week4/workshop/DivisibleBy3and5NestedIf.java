package week4.workshop;
import java.util.Scanner;

/**
 * Write a description of class DivisibleBy3and5NestedIf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleBy3and5NestedIf
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0){
            if (num % 5 == 0){
                System.out.println("Number is divisible by 3 and 5");
            }
        }else{
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}