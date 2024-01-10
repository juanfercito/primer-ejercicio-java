package segundoEjercicio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String time;
    public Appointment() {

    }
    public Appointment(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public Appointment(Doctor doctor, Patient patient, LocalDate date, LocalTime time) {
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
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
        return "Patient: " + patient.getName() + " Schedule with the Doctor " + doctor.getName() + " for " + date + " at " + time;
    }

}
