package segundoEjercicio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;


public class Calendar {

    // Logic for finding Doctors by Speciality
    public static void findBySpeciality() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the speciality you want to find: ");
        String specialityFound = scanner.nextLine();
        List<String> doctorList = Doctor.getDoctorList();
        List<String> foundDoctors = findDoctorList(doctorList, specialityFound);
        if (foundDoctors.isEmpty()) {
            System.out.println("Not Available");
        } else {
            System.out.println("Match Found for " + specialityFound + ":");
            for (String doctor : foundDoctors) {
                System.out.println(doctor);
            }
        }
    }
    public static List<String> findDoctorList(List<String> doctorList, String speciality) {
        return doctorList.stream()
                .filter(doctor -> doctor.contains(speciality))
                .toList();
    }

    // Logic for finding patients by disease
    public static void findByDisease() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the disease you want to find: ");
        String diseaseFound = scanner.nextLine();
        List<String> patientList = Patient.getPatientList();
        List<String> foundPatients = findPatientList(patientList, diseaseFound);
        if (foundPatients.isEmpty()) {
            System.out.println("No patients found");
        } else {
            System.out.println("Match Found for " + diseaseFound + ":");
            for (String patient : foundPatients) {
                System.out.println(patient);
            }
        }
    }
    public static List<String> findPatientList(List<String> patientList, String disease){
        return patientList.stream()
                .filter(patient -> patient.contains(disease))
                .toList();
    }

    // Logic for generating Dates and Times
    private LocalDate date;
    private LocalTime time;
    public void assignDateAndTime(int year, int month, int day, int hour, int minute) {
        this.date = LocalDate.of(year, month, day);
        this.time = LocalTime.of(hour, minute);
    }
    public LocalDate getDate() {
        return date;
    }
    public LocalTime getTime() {
        return time;
    }
    public static void getDateAndTime() {
        Calendar myCalendar = new Calendar();
        myCalendar.assignDateAndTime(2024, 2, 12, 11, 00);
    }
}

