package segundoEjercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    static int idDoctor = 0;
    static String name;
    static String speciality;
    // private List<String> availableMeetings;

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        // this.availableMeetings = new ArrayList<>();
    }

    // Behaviour
    public static void createDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("generating new Doctor");
        System.out.println("Write a name: ");
        Doctor.name = scanner.nextLine();
        idDoctor++;
        System.out.println("Write a Speciality: ");
        Doctor.speciality = scanner.nextLine();
    }
    public static void showDoctorData() {
        System.out.println("New Doctor is " + name);
        System.out.println("ID is " + idDoctor);
        System.out.println("Speciality is " + speciality);
    }
}
