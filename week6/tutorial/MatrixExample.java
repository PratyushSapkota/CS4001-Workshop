package week6.tutorial;
import java.util.Scanner;

public class MatrixExample
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int[][] matrix1 = new int[2][2];
       
       System.out.print("Enter the corresponding values for the position: \n");
       
       for (int i=0; i<matrix1.length; i++){
           for(int j = 0;j< matrix1[i].length; j++){
               System.out.print("\n" + i + " " + j + ": ");
               matrix1[i][j] = sc.nextInt();
           }
       }
       
          for (int i=0; i<matrix1.length; i++){
           for(int j = 0;j< matrix1[i].length; j++){
               System.out.print(matrix1[i][j] + " ");
           }
           System.out.println();
       }
       
   }
}
