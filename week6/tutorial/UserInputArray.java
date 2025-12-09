package week6.tutorial;
import java.util.Scanner;


public class UserInputArray
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the size of the array: ");
       int ArraySize = sc.nextInt();
       
       String[] names = new String[ArraySize];
       
       for(int i = 0; i<names.length; i++){
           System.out.println("Enter the student name for " + (i+1));
           names[i] = sc.next();
       }
       System.out.println("Printing the values");
       for (int j = 0; j <names.length;j++){
           System.out.println(names[j]);
       }
   }
}
