package segundoEjercicio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {

    static int idPatient;
    static String name;
    static String disease;
    static List<Doctor> doctors = new ArrayList<>();

    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }
    // entry new patient
    static void inputPatient() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("   ------------------- ");
            System.out.println("Generating a new patient: ");

            System.out.println("Input a name (or 'exit' to exit): ");
            String patientName = scanner.nextLine();
            if (patientName.equalsIgnoreCase("exit")) {
                break;
            }
            idPatient++;
            System.out.println("Input a disease: ");
            String patientDisease = scanner.nextLine();

            System.out.println("New patient added: " + patientName + " and have " + patientDisease);

            Patient patient = new Patient(patientName, patientDisease);
        }
    }
    // finding doctors by speciality
    static void showDoctors() {
        //List<Doctor> doctors = Doctor.getDoctorList();
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("Name" + doctor.getName() + "speciality: " + doctor.getSpeciality());
        }
        System.out.println("input the speciality: ");
        Scanner scanner = new Scanner(System.in);
        String specialityFound = scanner.nextLine();

        List<Doctor> specialities = findBySpeciality(specialityFound, doctors);
        if (!specialities.isEmpty()) {
            System.out.println("Doctors in area: " + specialityFound + ":");
            for (Doctor doctor : specialities) {
                System.out.println("Name" + doctor.getName() + "speciality: " + doctor.getSpeciality());
            }
        }
    }

    private static List<Doctor> findBySpeciality(String speciality, List<Doctor> doctors) {
        return doctors.stream()
                .filter(doctor -> doctor.getSpeciality().equalsIgnoreCase(speciality))
                .toList();
    }
}

