package segundoEjercicio;

import java.util.List;
import java.util.Scanner;
import segundoEjercicio.Doctor;


public class AppointOptions {
    public static void appointmentMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" 1. Book an appointment");
            System.out.println(" 2. Watch All the appointments");
            System.out.println(" 3. Watch All the Doctor appointments");
            System.out.println(" 4. Watch All the Patient appointments");
            System.out.println(" 5. Return to Main Menu");
            System.out.println("  Choose an option to continue: ");
            int calendarOption = scanner.nextInt();
            if (calendarOption == 1) {
                Calendar.scheduleAppointment();
            } else if (calendarOption == 2) {
                Appointment.showAllAppointments();
            } else if (calendarOption == 3) {
                Calendar.showDoctorAppointments();
            } else if (calendarOption == 4) {
                Calendar.showPatientAppointments();
            } else if (calendarOption == 5) {
                System.out.println("       ------------- ");
                break;
            }
        }
        scanner.nextLine();
    }
}
