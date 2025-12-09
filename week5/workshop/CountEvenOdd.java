package week5.workshop;


import java.util.Scanner;

public class CountEvenOdd
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int countEven = 0;
        int countOdd = 0;
        int digit = number;

        while (digit != 0){
            int i = digit % 10;
            if (i % 2 == 0){
                countEven += 1;
            }else {
                countOdd += 1;
            }
            digit = digit / 10;
        }

        System.out.println("Number of even digits: " + countEven);
        System.out.println("Number of odd digits: " + countOdd);

    }
    
}