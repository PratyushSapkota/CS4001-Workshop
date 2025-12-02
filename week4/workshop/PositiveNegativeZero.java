package week4.workshop;
import java.util.Scanner;


/**
 * Write a description of class PositiveNegativeZero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegativeZero
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (number == 0){
            System.out.println("Number is zero");
        }else if (number > 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
}