package segundoEjercicio;

import java.util.Scanner;

public class DoctorOptions {
    public static void doctorMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("   ---- Doctor Menu -----");
            System.out.println(" 1. Input a new Doctor");
            System.out.println(" 2. Watch All the Doctors");
            System.out.println(" 3. Return to Main Menu");
            System.out.println("  Choose an option to continue: ");
            int doctorOption = scanner.nextInt();
            if (doctorOption == 1) {
                Doctor.createDoctor();
            } else if (doctorOption == 2) {
                Doctor.showDoctorList();
            } else if (doctorOption == 3) {
                System.out.println("       ------------- ");
                break;
            }
        }
        scanner.nextLine();
    }
}
