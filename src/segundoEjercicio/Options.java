package segundoEjercicio;

import java.util.Scanner;

public class Options {
    public static void showMenu() {
        String option;
        Scanner scanner;
        while (true) {
            // Show Main Menu
            System.out.println("-------- MEDICAL APPOINTMENTS --------");
            System.out.println("        ----- Main Menu -----");
            System.out.println("1. Enter as Doctor");
            System.out.println("2. Enter as Patient");
            System.out.println("3. Appointments");
            System.out.println("4. Information");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            scanner = new Scanner(System.in);
            option = scanner.nextLine();

            // Do actions for selected option
            switch (option) {
                case "1":
                    // Execute the logic for Doctor here
                    System.out.println("       ------------- ");
                    System.out.println("logging as doctor...");
                    DoctorOptions.doctorMenu();
                    continue;
                case "2":
                    // Execute the logic for the Patient here
                    System.out.println("       ------------- ");
                    System.out.println("logging as patient...");
                    PatientOptions.PatientMenu();
                    continue;
                case "3":
                    // Execute the logic for Calendar and Schedule here
                    System.out.println("       ------------- ");
                    System.out.println("   ---- Appointment Menu -----");
                    AppointOptions.appointmentMenu();
                    continue;
                case "4":
                    // Execute the logic for Search Information
                    System.out.println("       ------------- ");
                    System.out.println("   ---- Information -----");
                    InfoOptions.infoMenu();
                    continue;
                case "5":
                    // Finish the program if User choose to exit
                    System.out.println("Exit. ¡Good Luck!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not allowed. Please, select a valid option.");
            }
            // Clean the Scanner buffer after reading the option
            scanner.nextLine();
        }
    }
}