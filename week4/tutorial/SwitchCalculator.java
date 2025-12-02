package week4.tutorial;
import java.util.Scanner;

public class SwitchCalculator
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operation(+, -, /, *): ");
        char operator = sc.next().charAt(0);

        float result;

        switch (operator) {
            case '+': 
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '*': 
                result = num1 * num2;
                break;

            default:
                result = 0;
                System.out.println("Invalid operator.");
        }
        System.out.println("Result: " + result);
    }
}