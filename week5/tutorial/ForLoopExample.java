package week5.tutorial;


/**
 * Write a description of class ForLoopExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoopExample{
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 10 ; i++){
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}