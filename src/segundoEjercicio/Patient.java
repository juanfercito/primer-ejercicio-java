package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
    private String name;
    private String disease;
    private static List<Patient> patients = new ArrayList<>();

    // Constructor parameters for Patient and its Getters & Setters
    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }
    public static void addPatient(Patient patient) {
        patients.add(patient);
    }
    public static List<Patient> getPatients() {
        return patients;
    }
    public static void showPatientList() {
        for (Patient patient : patients) {
            System.out.println(" - Patient: " + patient.getName() + ", sick of " + patient.getDisease());
        }
    }

    // Methods for finding patients
    private static Patient findPatientByName(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }
    public static void findByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient name to search:");
        String searchName = scanner.nextLine();
        Patient foundPatient = findPatientByName(searchName);
        if (foundPatient != null) {
            System.out.println("Patient found: " + foundPatient.getName() + ", diagnosis for " + foundPatient.getDisease());
        } else {
            System.out.println("Doctor not found.");
        }
    }
    private static List<Patient> findPatientsByDisease(String disease) {
        List<Patient> foundPatients = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getDisease().equalsIgnoreCase(disease)) {
                foundPatients.add(patient);
            }
        }
        return foundPatients;
    }
    public static void findByDisease() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter diagnosis to search:");
        String searchDisease = scanner.nextLine();
        List<Patient> foundPatientsByDisease = findPatientsByDisease(searchDisease);
        if (!foundPatientsByDisease.isEmpty()) {
            System.out.println("Patients found by disease, " + foundPatientsByDisease.size());
            for (Patient patient : foundPatientsByDisease) {
                System.out.println(" -  " + patient.getName());
            }
        } else {
            System.out.println("No Patients found for the given diagnosis.");
        }
        System.out.println("    ............ ");
    }
    public static void createPatient() {
        Patient newPatient = inputNewPatient();
        addPatient(newPatient);
        System.out.println(" New Patient added: " + newPatient.getName() + ", sick of " + newPatient.getDisease());
    }
    private static Patient inputNewPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Patient name: ");
        String name = scanner.nextLine();
        System.out.println(" Enter Patient ailment: ");
        String disease = scanner.nextLine();

        return new Patient(name, disease);
    }
}

