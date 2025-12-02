package week5.tutorial;

/**
 * Write a description of class NestedLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoop
{
    public static void main(String[] args){
        int rows = 7;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }    
            System.out.println();
        }
        
        
        for (int i=1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}