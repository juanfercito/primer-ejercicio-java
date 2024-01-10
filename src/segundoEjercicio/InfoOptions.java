package segundoEjercicio;

import java.util.Scanner;

public class InfoOptions {

    public static void infoMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" 1. Find Doctors by name");
            System.out.println(" 2. Find Doctors by Speciality");
            System.out.println(" 3. Find Patients by Name");
            System.out.println(" 4. Find Patients by Disease");
            System.out.println(" 5. Return to Main Menu");
            System.out.println("  Choose an option to continue: ");
            int infoOption = scanner.nextInt();

            if (infoOption == 1) {
                Doctor.findByName();
            } else if (infoOption == 2) {
                Doctor.findBySpeciality();
            } else if (infoOption == 3) {
                Patient.findByName();
            } else if (infoOption == 4) {
                Patient.findByDisease();
            } else if (infoOption == 5) {
                System.out.println("       ------------- ");
                break;
            } else {
                System.out.println("Not allowed. Please, select a valid option.");
            }
        scanner.nextLine();
        }
        // scanner.nextLine();
    }
}
