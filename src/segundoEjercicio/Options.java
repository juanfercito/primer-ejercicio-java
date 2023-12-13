package segundoEjercicio;

import java.util.Scanner;

public class Options {
    public static void showMenu() {
        String option;
        while (true) {
            // Mostrar menú
            System.out.println("-------- MEDICAL CONSULTATIONS--------");
            System.out.println("----- Main Menu -----");
            System.out.println("1. Entrar como doctor");
            System.out.println("2. Entrar como paciente");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextLine();
            // Realizar acciones según la opción seleccionada
            switch (option) {
                case "1":
                    System.out.println("Entrando como doctor...");
                    // Puedes agregar lógica específica para el doctor aquí
                    Doctor.createDoctor();
                    Doctor.showDoctorData();
                    continue;
                case "2":
                    System.out.println("Entrando como paciente...");
                    // Puedes agregar lógica específica para el paciente aquí
                    Patient.inputPatient();
                    Patient.showPatient();
                    continue;
                case "3":
                    System.out.println("Saliendo. ¡Hasta luego!");
                    // Terminar el programa si el usuario elige salir
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }

            // Limpiar el buffer del scanner después de leer la opción
            scanner.nextLine();
        }
    }
}