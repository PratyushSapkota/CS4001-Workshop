package week4.workshop;
import java.util.Scanner;


public class PassOrFail
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        
        if (marks >= 40){
            System.out.println("Student is pass");
        
        }else{
            System.out.println("Student is fail");
        }
    }
}