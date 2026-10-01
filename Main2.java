
import doctor.Doctor;
import patient.Patient;

public class Main2 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr. Arun", "Cardiologist", 1000);
        Doctor d2 = new Doctor(102, "Dr. Priya", "Dermatologist", 800);

        Patient p1 = new Patient(1, "Rahul", "Heart Problem", 45);
        Patient p2 = new Patient(2, "Anu", "Skin Allergy", 25);
        Patient p3 = new Patient(3, "Kiran", "Heart Problem", 50);

        System.out.println("Patient: " + p1.getName());
        p1.display();
        System.out.println("Treating Doctor: " + d1.getName());

        System.out.println("\nPatient: " + p2.getName());
        p2.display();
        System.out.println("Treating Doctor: " + d2.getName());

        System.out.println("\nPatient: " + p3.getName());
        p3.display();
        System.out.println("Treating Doctor: " + d1.getName());

        System.out.println("\nTotal Consultation Fee");
        System.out.println(d1.getName() + ": " + (2 * d1.getConsultationFee()));
        System.out.println(d2.getName() + ": " + (1 * d2.getConsultationFee()));
    }
}