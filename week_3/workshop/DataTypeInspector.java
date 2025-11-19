package week_3.workshop;
import java.util.Scanner;

public class DataTypeInspector
{
    public static void main(String[] args){
        byte b = 125;
        short s = 3000;
        int i = 2000000;
        long l = 900000000000L;
        float f = 2.11f;
        double d = 5.1;
        char c = 'a';
        boolean t = true;

        System.out.println("Here are the following 8 primitive data types along with it's proper literals");
        System.out.println("Byte: " + b + ".");
        System.out.println("Short: " + s + ".");
        System.out.println("Int: " + i + ".");
        System.out.println("Long: " + l + ".");
        System.out.println("Float: " + f + ".");
        System.out.println("Double: " + d + ".");
        System.out.println("Char: " + c + ".");
        System.out.println("Boolean: " + t + ".");
    }
}