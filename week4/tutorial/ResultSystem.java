package week4.tutorial;
import java.util.Scanner;


/**
 * Write a description of class ResultSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultSystem
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter percentage: ");
        double percentage = sc.nextDouble();
        
        String result;
        
        if ( percentage >= 95 && percentage <= 100  ){
            result = "Dist";
        }else if ( percentage >= 94 && percentage <=80 ){
            result = "First Division";
        }else if ( percentage >=79 && percentage <=70 ){
            result = "Second Division";
        }else if ( percentage >= 69 && percentage <= 50 ){
            result = "Third Division";
        }else {
            result = "Fail";
        }
        
        System.out.println(result);
    }
}