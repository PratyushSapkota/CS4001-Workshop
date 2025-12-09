package week5.workshop;


/**
 * Write a description of class Question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question5
{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--){
            for(int j = rows; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}