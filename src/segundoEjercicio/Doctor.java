package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    static int idDoctor = 0;
    static String name;
    static String speciality;
    static List<String> doctorList = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();
    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }
    String getName() {
        return name;
    }
    String getSpeciality() {
        return speciality;
    }
    @Override
    public String toString() {
        return " - Doctor: " + name + ", specialist in " + speciality;
    }

    // Add the data of the doctor to List
    public static void dataDoctor() {
        Scanner scanner = new Scanner(System.in);
        for (Doctor newDoctor = createDoctor(scanner);
             !newDoctor.getName().equalsIgnoreCase("exit");
             newDoctor = createDoctor(scanner)) {

            doctorList.add(String.valueOf(newDoctor));

            // Show the data of the new doctor added
            System.out.println("New Doctor Generated: " + newDoctor);
            System.out.println("       ------------- ");
        }
    }
    // Show the current list of the doctors
    public static List<String> showDoctorList() {
        // System.out.println("Lista de doctores ingresados al final del programa:");
        for (String doctor : doctorList) {
            System.out.println(doctor);
        }
        System.out.println("       ------------- ");
        return doctorList;
    }
    // Input the new doctor
    private static Doctor createDoctor(Scanner scanner) {
        System.out.print("Write the name of Doctor (or write 'exit' to end): ");
        String name = scanner.nextLine();

        // If the user decides to exit, return an special object
        if (name.equalsIgnoreCase("exit")) {
            return new Doctor("exit", "exit");
        }

        System.out.print("Write the speciality: ");
        String speciality = scanner.nextLine();

        return new Doctor(name, speciality);
    }
    public static List<String> getDoctorList() {
        for (Doctor doctor :doctors) {
            doctorList.add(doctor.getName() + " " + doctor.getSpeciality());
        }
        return doctorList;
    }

     /* private static List<Doctor> genDoctorList() {
        return getDoctorList();
    }*/
}