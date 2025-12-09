package week5.workshop;


/**
 * Write a description of class Question7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question7
{
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            if (i == 6){
                break;
            }else{
                System.out.println(i);
            }
        }

        System.out.println();

        for (int i = 1; i <= 10; i++){
            if (i == 6) {
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}