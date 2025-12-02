package week5.tutorial;
import java.util.Scanner;

public class MenuSystem
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1: Burger Rs 300");
            System.out.println("2: Momo Rs 400");
            System.out.println("3: Pizza Rs 500 \n");
            System.out.println("0: Generate Bill");
            System.out.println("Choose the correspoinding number.");
            choice = sc.nextInt();

            if (choice == 0){
                System.out.println("Generating Bill...");
                System.out.println("Your total amount is: Rs"+total);
            }else{
                System.out.println("Enter quantity: ");
                int quantity = sc.nextInt();
                switch (choice){
                    case 1:
                        total += (300 * quantity);
                        break;
                    case 2:
                        total += (400 * quantity);
                        break; 
                    case 3:
                        total += (500 * quantity);
                        break;
                    default:
                        System.out.println("Invalid Request, Choose again.");
                }
            }
        }while(choice != 0);
    }
}