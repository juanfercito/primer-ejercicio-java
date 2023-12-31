package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
    static int idPatient;
    static String name;
    static String disease;
    static List<String> patientList = new ArrayList<>();
    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    String getName() {
        return name;
    }
    String getDisease() {
        return disease;
    }
    @Override
    public String toString() {
        return "Patient: " + name + ", sick of " + disease;
    }

    // Add new patient to List of patients
    public static void dataPatient() {
        Scanner scanner = new Scanner(System.in);
        for (Patient newPatient = createPatient(scanner);
             !newPatient.getName().equalsIgnoreCase("exit");
             newPatient = createPatient(scanner)) {

            // Add the new patient to the list
            patientList.add(String.valueOf(newPatient));

            // Show the data of the new patient
            System.out.println("Patient added: " + newPatient);
        }
    }
    // Show the list of patients at the end of the program
    public static List<String> showPatientList() {
        System.out.println("Total of patients: " + patientList.size());
        for (String patient : patientList) {
            System.out.println(patient);
        }
        return patientList;
    }
    // Input a new patient
    static Patient createPatient(Scanner scanner) {
        System.out.println("Write a name or exit to continue: ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("exit")) {
            // If the user choose to exit, return an special exit code
            return new Patient("exit", "exit");
        }
        System.out.println("Write a disease:");
        String disease = scanner.nextLine();
        return new Patient(name, disease);
    }
    public static List<String> getPatientList() {
        List<Patient> patients = new ArrayList<>();
        for (Patient patient :patients) {
            patientList.add(patient.getName() + " " + patient.getDisease());
        }
        return patientList;
    }
}

