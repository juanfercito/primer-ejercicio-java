package segundoEjercicio;

import java.util.Scanner;

public class AppointOptions {

    public static void appointmentMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" 1. Book an appointment");
            System.out.println(" 2. Watch All the appointments");
            System.out.println(" 3. Find Doctors by Speciality");
            System.out.println(" 4. Find Patients by Disease");
            System.out.println(" 5. Return to Main Menu");
            System.out.println("  Choose an option to continue: ");
            int calendarOption = scanner.nextInt();
            if (calendarOption == 1) {
                System.out.println("pass");
            } else if (calendarOption == 2) {
                System.out.println("pass");
            } else if (calendarOption == 3) {
                Doctor.findByName();
                Doctor.findBySpeciality();
            } else if (calendarOption == 4) {
                Patient.findByName();
                Patient.findByDisease();
            } else if (calendarOption == 5) {
                System.out.println("       ------------- ");
                break;
            }
        }
        scanner.nextLine();
    }
}
