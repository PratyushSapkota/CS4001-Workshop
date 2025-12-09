package week5.workshop;
import java.util.Scanner;

/**
 * Write a description of class ReverseDigit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to check palindrome: ");
        int number = sc.nextInt();
        
        int reversed= 0; 
        int digits = number;
        
        while (digits != 0){
            reversed = (reversed * 10) + (digits % 10);
            digits = digits / 10;
        }
        System.out.println("Reverse of " + number + " is " + reversed);
        
        System.out.print("Number is");
        System.out.print((number == reversed) ? "" : "not ");
        System.out.print("palindrome.");
        
    }
}