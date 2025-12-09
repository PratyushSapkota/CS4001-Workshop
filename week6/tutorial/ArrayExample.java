package week6.tutorial;

public class ArrayExample
{
    public static void main(String[] args){
        int[] age;
        age= new int[5];

        age[0] = 12;
        age[1]= 13;
        age[2]= 25;
        age[3]= 28;
        age[4] = 34;
        
        
        
        int[] number = new int[5];
        
        for (int i=0; i< number.length; i++){
            number[i] = (10 * (i+1));
        }
        
        for (int y=0; y<number.length; y++){
            System.out.println(number[y]);
        }
        
    }
}
