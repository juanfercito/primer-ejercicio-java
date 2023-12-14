package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {

    static int idPatient;
    static String name;
    static String disease;
    // private static List<String> appointment;

    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
        // this.appointment = new ArrayList<String>();
    }

    public static void inputPatient() {
        System.out.println("Generating a new patient: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a name: ");
        Patient.name = scanner.nextLine();
        idPatient++;
        System.out.println("Write a disease: ");
        Patient.disease = scanner.nextLine();
    }

    public static void showPatient() {
        System.out.println("New Patient is " + name);
        System.out.println("ID is " + idPatient);
        System.out.println("Condition is " + disease);
    }
}
