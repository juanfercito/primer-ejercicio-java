package segundoEjercicio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;
    private LocalTime time;
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();

    // Constructor parameters and its Getters & Setters
    public Appointment(Doctor doctor, Patient patient, LocalDate date, LocalTime time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
        allAppointments.add(this);
    }

    public static void setDoctors(List<Doctor> doctors) {
        Appointment.doctors = doctors;
    }
    public static void setPatient(List<Patient> patients) {
        Appointment.patients = patients;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public LocalTime getTime() {
        return time;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }
    @Override
    public String toString() {
        return " - Patient: " + patient.getName() + " Schedule with the Doctor " + doctor.getName() + " for " + date + " at " + time;
    }

    private static Set<Appointment> allAppointments = new HashSet<>();
    public static void showAllAppointments() {
        System.out.println("All Appointments:");

        if (allAppointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : allAppointments) {
                System.out.println(appointment);
            }
        }
    }
}
