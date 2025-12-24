package week8.workshop;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill {
    private String consumerName;
    private double unitsConsumed;

    public ElectricityBill(String consumerName, double unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        // first 100 units @ rs5
        // remaining units @ rs8
        double total = 0;
        if (this.unitsConsumed > 100) {
            total += (100 * 5) + ((this.unitsConsumed - 100) * 8);
        } else {
            total += this.unitsConsumed * 5;
        }

        return total;
    }

}