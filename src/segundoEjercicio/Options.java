package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
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
            System.out.println("3. Search for Appointment");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            scanner = new Scanner(System.in);
            option = scanner.nextLine();

            // Do actions for selected option
            switch (option) {
                case "1":
                    // Execute the logic for Doctor here
                    System.out.println("       ------------- ");
                    System.out.println("logging as doctor...");
                    while (true) {
                        System.out.println("   ---- Doctor Menu -----");
                        System.out.println(" 1. Input a new Doctor");
                        System.out.println(" 2. Watch All the Doctors");
                        System.out.println(" 3. Return to Main Menu");
                        System.out.println("  Choose an option to continue: ");
                        int doctorOption = scanner.nextInt();
                        if (doctorOption == 1) {
                            Doctor.dataDoctor();
                        } else if (doctorOption == 2) {
                            Doctor.showDoctorList();
                        } else if (doctorOption == 3) {
                            System.out.println("       ------------- ");
                            break;
                        }
                    }
                    scanner.nextLine();
                    continue;
                case "2":
                    // Execute the logic for the Patient here
                    System.out.println("       ------------- ");
                    System.out.println("logging as patient...");
                    while (true) {
                        System.out.println("   ---- Patient Menu -----");
                        System.out.println(" 1. Input a new patient");
                        System.out.println(" 2. Watch All Patients");
                        System.out.println(" 3. Return to Main Menu");
                        System.out.println("  Choose an option to continue: ");

                        int patientOption = scanner.nextInt();
                        if (patientOption == 1) {
                            Patient.dataPatient();
                        } else if (patientOption == 2) {
                            Patient.showPatientList();
                        } else if (patientOption == 3) {
                            System.out.println("       ------------- ");
                            break;
                        }
                    }
                    scanner.nextLine();
                    continue;
                case "3":
                    // Execute the logic for Calendar and Schedule here
                    System.out.println("       ------------- ");
                    while (true) {
                        System.out.println("   ---- Schedule Menu -----");
                        System.out.println(" 1. Schedule an appointment");
                        System.out.println(" 2. Watch All the appointments");
                        System.out.println(" 3. Find Doctors by Speciality");
                        System.out.println(" 4. Find Patients by Disease");
                        System.out.println(" 5. Return to Main Menu");
                        System.out.println("  Choose an option to continue: ");
                        int calendarOption = scanner.nextInt();
                        if (calendarOption == 1) {
                            System.out.println("pass");
                        } else if (calendarOption == 2) {
                            System.out.println("Not Available View");
                        } else if (calendarOption == 3) {
                            Calendar.findBySpeciality();
                        } else if (calendarOption == 4) {
                            Calendar.findByDisease();
                        } else if (calendarOption == 5) {
                            System.out.println("       ------------- ");
                            break;
                        }
                    }
                    scanner.nextLine();
                    continue;
                case "4":
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