package segundoEjercicio;

import java.util.Scanner;

public class PatientOptions {

    public static void PatientMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("   ---- Patient Menu -----");
            System.out.println(" 1. Input a new patient");
            System.out.println(" 2. Watch All Patients");
            System.out.println(" 3. Return to Main Menu");
            System.out.println("  Choose an option to continue: ");

            int patientOption = scanner.nextInt();
            if (patientOption == 1) {
                Patient.createPatient();
            } else if (patientOption == 2) {
                Patient.showPatientList();
            } else if (patientOption == 3) {
                System.out.println("       ------------- ");
                break;
            }
        }
        scanner.nextLine();
    }
}
