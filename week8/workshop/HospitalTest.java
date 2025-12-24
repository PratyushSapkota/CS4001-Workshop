package week8.workshop;


/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest {
    public static void main(String[] args) {
        PatientBill patientBill1 = new PatientBill("name1", 44, 8);
        PatientBill patientBill2 = new PatientBill("name2", 67, 3);

        System.out.println("Patient1 details: ");
        System.out.println("Name: " + patientBill1.getPatientName());
        System.out.println("Age: " + patientBill1.getAge());
        System.out.println("Days admitted: " + patientBill1.getDaysAdmitted());
        System.out.println("Total: " + patientBill1.calculateTotalBill());


        System.out.println("Patient2 details: ");
        System.out.println("Name: " + patientBill2.getPatientName());
        System.out.println("Age: " + patientBill2.getAge());
        System.out.println("Days admitted: " + patientBill2.getDaysAdmitted());
        System.out.println("Total: " + patientBill2.calculateTotalBill());
    }
}