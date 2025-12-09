package week5.workshop;


/**
 * Write a description of class Question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question6
{
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}