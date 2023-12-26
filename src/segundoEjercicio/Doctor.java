package segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    static int idDoctor = 0;
    static String name;
    static String speciality;
    static List<String> doctorList = new ArrayList<>();
    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        // this.availSchedule = Calendar.genDatesToDoctor();
    }
    String getName() {
        return name;
    }
    String getSpeciality() {
        return speciality;
    }
    @Override
    public String toString() {
        return "Doctor: " + name + ", specialist in " + speciality;
    }
    public static void dataDoctor() {
        Scanner scanner = new Scanner(System.in);
        for (Doctor nuevoDoctor = createDoctor(scanner);
             !nuevoDoctor.getName().equalsIgnoreCase("exit");
             nuevoDoctor = createDoctor(scanner)) {

            // Agregar los datos del doctor a la lista
            doctorList.add(String.valueOf(nuevoDoctor));

            // Mostrar solo los datos del doctor ingresado
            System.out.println("Doctor ingresado: " + nuevoDoctor);
        }

        // Mostrar la lista completa de doctores al final del programa
        System.out.println("Lista de doctores ingresados al final del programa:");
        for (String doctor : doctorList) {
            System.out.println(doctor);
        }
    }

    private static Doctor createDoctor(Scanner scanner) {
        System.out.print("Write the name of Doctor (or write 'exit' to end): ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("exit")) {
            // Si el usuario decide terminar, retornamos un objeto especial
            return new Doctor("exit", "exit");
        }

        System.out.print("Write the speciality: ");
        String speciality = scanner.nextLine();

        return new Doctor(name, speciality);
    }
}