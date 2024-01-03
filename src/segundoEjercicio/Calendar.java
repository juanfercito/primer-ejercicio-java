package segundoEjercicio;

import java.util.List;
import java.util.Scanner;


public class Calendar {
    public static void findBySpeciality() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the speciality you find: ");
        String specialityFound = scanner.nextLine();
        List<String> doctorList = Doctor.getDoctorList();
        List<String> foundDoctors = findDoctorList(doctorList, specialityFound);
        if (foundDoctors.isEmpty()) {
            System.out.println("Not Available");
        } else {
            System.out.println("Match Found for " + specialityFound + ":");
            for (String doctor : foundDoctors) {
                System.out.println(doctor);
            }
        }
    }
    public static List<String> findDoctorList(List<String> doctorList, String speciality) {
        return doctorList.stream()
                .filter(doctor -> doctor.contains(speciality))
                .toList();
    }
}

