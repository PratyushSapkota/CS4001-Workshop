package week5.workshop;


import java.util.Scanner;

/**
 * Write a description of class PrimeCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check prime or not");
        int number = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < number; i++ ){
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}