package week5.workshop;


/**
 * Write a description of class fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String[] args){
        int x = 0;
        int y = 1;
        int next = y;
        
        System.out.print(x + " ");
        for (int i = 0; i <= 10; i++){
            System.out.print(next + " ");
            x = y;
            y = next;
            next = x + y;
        }
    }
}