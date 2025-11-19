package week_3.workshop;
import java.util.Scanner;

public class RickshawFare
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Rickshaw Fare Calculator");
        
        System.out.println("Enter Distance (in km): ");
        float km = sc.nextFloat();

        System.out.println("Enter time duration (in mins): ");
        int mins = sc.nextInt();

        System.out.println("Are you a local (bool): ");
        boolean isLocal = sc.nextBoolean();

        System.out.println("Is the travel at night (bool): ");
        boolean isNight = sc.nextBoolean();

        float baseFare = 50;
        float localDiscount = 0.2f; // 20% discount
        float nightSurcharge = 0.1f; // 10% surcharge

        float fare = baseFare * (km + mins);
        fare = (isLocal) ? fare = fare * (1 - localDiscount) : fare;
        fare = (isNight) ? fare = fare * (1 + nightSurcharge) : fare;
        
        System.out.println("Total fare: Rs" + fare);
    }
}
