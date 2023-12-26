package primerEjercicio;

import java.util.*;

public class For {
    static String name;
    static String age;
    static int id;
    static String email;
    static List<String> listPeople = new ArrayList<>();

    public For(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;
    }

    public static void main(String[] args) {
        // Crear una lista para almacenar nombres de usuarios
        Scanner scanner = new Scanner(System.in);

        // Utilizar un bucle para ingresar datos de usuarios
        for (For newPerson = getPersonData(scanner);
             !newPerson.getName().equalsIgnoreCase("fin");
             newPerson = getPersonData(scanner)) {

            // Agregar los datos del usuario a la lista
            listPeople.add(String.valueOf(newPerson));

            // Mostrar solo los datos del usuario ingresado
            System.out.println("Usuario ingresado: " + newPerson);
            System.out.println("--------------");
        }

        // Mostrar la lista completa de usuarios al final del programa
        System.out.println("Lista de nombres actual:\n");
        for (String person : listPeople) {
            System.out.println(person);
        }
    }

    // Método para obtener el nombre
    private static For getPersonData(Scanner scanner) {
        System.out.print("Escriba un nombre (o escriba 'fin' para terminar): ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("fin")) {
            // Si el usuario decide terminar, retornamos un objeto especial
            return new For("fin",
                    "fin",
                    "fin");
        }
        System.out.println("Escriba su edad: ");
        String age = scanner.nextLine();

        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();

        return new For(name, age, email);
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return " -Nombre: " + name + ", edad: " + getAge() + ", Email: " + email;
    }
}

