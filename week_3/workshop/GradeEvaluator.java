package week_3.workshop;
import java.util.Scanner;


public class GradeEvaluator
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a numeric grade (0-100): ");
        float grade = sc.nextFloat();
        
        System.out.println(grade >= 40 ? "Pass" : "Fail");        
    }
}