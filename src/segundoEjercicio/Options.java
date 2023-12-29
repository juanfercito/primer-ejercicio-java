package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options {
    public static void showMenu() {
        String option;
        // List<Doctor> doctors = new ArrayList<>();
        while (true) {
            // Mostrar menú
            System.out.println("-------- MEDICAL APPOINTMENTS --------");
            System.out.println("        ----- Main Menu -----");
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
                    System.out.println("       ------------- ");
                    System.out.println("logging as doctor...");
                    // Puedes agregar lógica específica para el doctor aquí
                    Doctor.dataDoctor();
                    Doctor.showDoctorList();
                    continue;
                case "2":
                    System.out.println("       ------------- ");
                    System.out.println("logging as pacient...");
                    while (true) {
                        // Puedes agregar lógica específica para el paciente aquí
                        System.out.println("   ---- Patient Menu -----");
                        System.out.println(" 1. Input a new patient");
                        System.out.println(" 2. Schedule with a Doctor");
                        System.out.println(" 3. Exit");
                        System.out.println("  Choose an option to continue: ");

                        // Scanner optionP = new Scanner(System.in);
                        int patientOption = scanner.nextInt();
                        if (patientOption == 1) {
                            Patient.dataPatient();
                        } else if (patientOption == 2) {
                            Patient.getDoctorList();
                        } else if (patientOption == 3) {
                            System.out.println("       ------------- ");
                            break;
                        }
                        scanner.nextLine();
                    }
                    continue;
                case "3":
                    Calendar.availDate();
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