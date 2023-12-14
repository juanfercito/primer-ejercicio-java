package segundoEjercicio;

import java.util.Date;
import java.util.Scanner;

public class Options {
    public static void showMenu() {
        String option;
        while (true) {
            // Mostrar menú
            System.out.println("-------- MEDICAL APPOINTMENTS --------");
            System.out.println("    ----- Main Menu -----");
            System.out.println("1. Enter a Doctor");
            System.out.println("2. Enter a Patient");
            System.out.println("3. Search for Appointment");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextLine();
            // Realizar acciones según la opción seleccionada
            switch (option) {
                case "1":
                    System.out.println("logging as doctor...");
                    // Puedes agregar lógica específica para el doctor aquí
                    Doctor.createDoctor();
                    Doctor.showDoctorData();
                    continue;
                case "2":
                    System.out.println("logging as paciente...");
                    // Puedes agregar lógica específica para el paciente aquí
                    Patient.inputPatient();
                    // Patient.makeAppointment();
                    Patient.showPatient();
                    continue;
                case "3":
                    Calendar.getDates();
                    continue;
                case "4":
                    System.out.println("Exit. ¡Good Luck!");
                    // Terminar el programa si el usuario elige salir
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not allowed. Please, select a valid option.");
            }

            // Limpiar el buffer del scanner después de leer la opción
            scanner.nextLine();
        }
    }
}