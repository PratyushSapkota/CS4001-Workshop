import java.util.Scanner;

public class LabQuestion5_Calculator
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int number1 = sc.nextInt();

        System.out.println("Enter number two: ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;

        System.out.println("Sum of the two numbers: " + sum);
        System.out.println("Difference of the two numbers: " + difference);
        System.out.println("Product of the two numbers: " + product);
        
        sc.close();

    }
}