package week6.workshop;


import java.util.Scanner;

/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question3
{
    public static void main(String[] args) {
        String[] names = {"saroj", "sushant", "ujwal", "rabina", "sandesh"};

        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("on index 2: "+ names[2]);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name to update at index 4: ");
        names[4] = sc.next();

        System.out.println("updated array: ");
        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

    }
}