package week4.workshop;
import java.util.Scanner;


/**
 * Write a description of class EvenOrOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOrOdd
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to be checked if odd or even: ");
        int number = sc.nextInt();

        if ( number % 2 == 0 ){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

    }
}