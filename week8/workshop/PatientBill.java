package week8.workshop;


/**
 * Write a description of class PatientBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatientBill {
    private String patientName;
    private int age;
    private int daysAdmitted;
    private static double dailyCharge = 500;

    public PatientBill(String patientName, int age, int daysAdmitted) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public double calculateTotalBill() {
        double total = 0;

        total = this.daysAdmitted * dailyCharge;

        if (this.daysAdmitted > 7) {
            total -= total * 0.1;
        }

        return total;
    }
}