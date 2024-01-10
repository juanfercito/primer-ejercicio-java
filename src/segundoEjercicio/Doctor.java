package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    private String name;
    private String speciality;
    private static List<Doctor> doctors = new ArrayList<>();

    // Constructor for Doctor class and its getters & setters
    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }
    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public static void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public static List<Doctor> getDoctors() {
        return doctors;
    }
    public static void showDoctorList() {
        for (Doctor doctor : doctors) {
            System.out.println(" - Doctor: " + doctor.getName() + ", Area: " + doctor.getSpeciality());
        }
    }

    // Methods for finding doctors
    private static Doctor findDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        return null;
    }
    public static void findByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doctor name to search:");
        String searchName = scanner.nextLine();
        Doctor foundDoctor = findDoctorByName(searchName);
        if (foundDoctor != null) {
            System.out.println("Doctor found: " + foundDoctor.getName() + ", specialist in " + foundDoctor.getSpeciality());
        } else {
            System.out.println("Doctor not found.");
        }
    }
    private static List<Doctor> findDoctorsBySpeciality(String speciality) {
        List<Doctor> foundDoctors = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (doctor.getSpeciality().equalsIgnoreCase(speciality)) {
                foundDoctors.add(doctor);
            }
        }
        return foundDoctors;
    }
    public static void findBySpeciality() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter speciality to search:");
        String searchSpeciality = scanner.nextLine();
        List<Doctor> foundDoctorsBySpeciality = findDoctorsBySpeciality(searchSpeciality);
        if (!foundDoctorsBySpeciality.isEmpty()) {
            System.out.println("Doctors found by speciality, " + foundDoctorsBySpeciality.size());
            for (Doctor doctor : foundDoctorsBySpeciality) {
                System.out.println(" -  " + doctor.getName());
            }
        } else {
            System.out.println("No doctors found for the given speciality.");
        }
        System.out.println("    ............ ");
    }

    // Using the logic for creating a new Doctor
    public static void createDoctor() {
        Doctor newDoctor = inputNewDoctor();
        addDoctor(newDoctor);
        System.out.println(" New Doctor added: " + newDoctor.getName() + ", specialized in " + newDoctor.getSpeciality());
    }
    private static Doctor inputNewDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter doctor name: ");
        String name = scanner.nextLine();
        System.out.println(" Enter doctor speciality: ");
        String speciality = scanner.nextLine();

        return new Doctor(name, speciality);
    }
}