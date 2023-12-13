package segundoEjercicio;

import java.util.Scanner;

public class Patient {
    static int idPatient;
    static  String name;
    static String disease;
    public static void inputPatient() {
        System.out.println("Ingresando un nuevo paciente: ");
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
    };
}
