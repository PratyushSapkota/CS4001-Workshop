package week5.workshop;
import java.util.Scanner;


/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to print its multiplication table.");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}