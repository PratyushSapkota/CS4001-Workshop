import java.util.Scanner;

public class LabQuestion6_WaterLevelMonitor
{
   public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       double warningLevel = 1000;
       
       System.out.println("Enter your water level.");
       double waterLevel = sc.nextDouble();
       
       System.out.println("The current water level is  " + waterLevel + "L");
       
       String label = (waterLevel > warningLevel) ? "WARNING water level has reacheda above 1000" : "Water level is Normal";
       System.out.println("Status: " + label);
       sc.close();
       }    
}