package week8.workshop;


/**
 * Write a description of class ElectricityBillTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBillTest {
    public static void main(String[] args) {
        double testUnits = 200;


        ElectricityBill electricityBill = new ElectricityBill("name", testUnits);

        System.out.println("Total bill (expected 1300): ");
        System.out.println(electricityBill.calculateBill());


        double testUnits2 = 55.5;
        electricityBill.setUnitsConsumed(testUnits2);

        System.out.println("Total bill (expected 277.5): ");
        System.out.println(electricityBill.calculateBill());
    }
}