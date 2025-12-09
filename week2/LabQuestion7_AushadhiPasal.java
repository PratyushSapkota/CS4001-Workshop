package week2;

import java.util.Scanner;

/**
 * 
 * Question 7
 */
public class LabQuestion7_AushadhiPasal
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Aushadhi Pasal");
        System.out.println();
        
        String name;
        float price = 100;
        int stock;
        
        System.out.println("Enter the name to store in Aushadhi Pasal: ");
        name = sc.next();
        
        System.out.println("Enter the quantity for " + name);
        stock = sc.nextInt();
        System.out.println("The price in which it needs to be sold at is " + price);
        
        
        System.out.println();
        
        System.out.println("Inventory");
        System.out.println("Name \t Price per tablet \t Stock");
        System.out.println(name + " \t\t " + price + " \t\t " + stock );
        
        System.out.println();
        System.out.println();
        System.out.println("User:");
        System.out.println("Enter the name of medicine you want: ");
        
        System.out.println("Enter the quantity you want: ");
        int userQuantity = sc.nextInt();
        
    
    }
}
