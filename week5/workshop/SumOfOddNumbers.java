package week5.workshop;


/**
 * Write a description of class SumOfOddNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfOddNumbers
{
    public static void main(String[] args){
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                oddSum += i;
            }else {
                evenSum += i;
            }
        }
        
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even number: " + evenSum);
    }
}