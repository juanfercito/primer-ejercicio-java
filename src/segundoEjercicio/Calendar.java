package segundoEjercicio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar {

    // Logic for assigning Date and Time
    public static LocalDate assignDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date to assign (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();

        // Logic for validating Date format

        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public static LocalTime assignTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time to assign (HH:mm): ");
        String timeString = scanner.nextLine();

        // Logic for validating Time format

        return LocalTime.parse(timeString);
    }

    // Iterate and Show Appoints with doctor
    public static void getDoctorAppointments(Doctor doctor) {
        List<Appointment> doctorAppointments = doctor.getAppointments();

        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Appointments:");

        if (doctorAppointments.isEmpty()) {
            System.out.println("No appointments scheduled for this doctor.");
        } else {
            for (Appointment appointment : doctorAppointments) {
                System.out.println(appointment);
            }
        }
    }
    public static void showDoctorAppointments() {
        Doctor doctor = verifyDoctor();
        getDoctorAppointments(doctor);
    }

    // Iterate and Show Appoints for patient
    public static void getPatientAppointments(Patient patient) {
        List<Appointment> patientAppointments = patient.getAppointments();

        System.out.println("Patient: " + patient.getName());
        System.out.println("Appointments:");

        if (patientAppointments.isEmpty()) {
            System.out.println("No appointments scheduled for this patient.");
        } else {
            for (Appointment appointment : patientAppointments) {
                System.out.println(appointment);
            }
        }
    }
    public static void showPatientAppointments() {
        Patient patient = verifyPatient();
        getPatientAppointments(patient);
    }

    // Logic for scheduling the appointment
    public static void scheduleAppointment() {
        Patient patient = verifyPatient();
        getPatientAppointments(patient);
        Doctor doctor = verifyDoctor();
        getDoctorAppointments(doctor);
        LocalDate date = assignDate();
        LocalTime time = assignTime();

        Appointment appointment = new Appointment(doctor, patient, date, time);
        doctor.addAppointments(appointment);
        patient.addAppointments(appointment);

        System.out.println(" * Scheduled Successfully * ");
    }

    private static Patient verifyPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("search for Patient: ");
        String patientName = scanner.nextLine();

        for (Patient existingPatient : Patient.getPatients()) {
            if (existingPatient.getName().equalsIgnoreCase(patientName)) {
                return existingPatient;
            }
        }
        System.out.println("Enter Patient disease: ");
        String disease = scanner.nextLine();
        Patient newPatient = new Patient(patientName, disease);
        Patient.addPatient(newPatient);
        return newPatient;
    }
    private static Doctor verifyDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Search for Speciality: ");
        String speciality = scanner.nextLine();

        List<Doctor> foundDoctors = new ArrayList<>();

        for (Doctor doctor : Doctor.getDoctors()) {
            if (doctor.getSpeciality().equalsIgnoreCase(speciality)) {
                foundDoctors.add(doctor);
            }
        }

        if (foundDoctors.isEmpty()) {
            System.out.println("No Doctors found");
            return null;
        } else {
            System.out.println("Matches found for Doctor: " + foundDoctors.size());
            int index = 1;
            for (Doctor doctor : foundDoctors) {
                System.out.println(index + ". " + doctor.getName());
                index++;
            }
        }

        System.out.println("Select Doctor (enter the corresponding number): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= foundDoctors.size()) {
            return foundDoctors.get(choice - 1);
        } else {
            System.out.println("Invalid choice. ");
            return null;
        }
    }
}