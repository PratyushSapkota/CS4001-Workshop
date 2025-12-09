package week6.tutorial;


public class SumOfArray
{
    public static void main(String[] args){
        int[] arr = {10, 40, 50, 80, 90};
        
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        System.out.println("The sum of the items of the array are: " + sum);
    }
}
