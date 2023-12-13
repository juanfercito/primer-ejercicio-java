package segundoEjercicio;
public class Doctor {
    static int id;
    static String name;
    static String speciality;

    // Behaviour
    Doctor() {
        Doctor.name = "Juanfer";
        Doctor.id = 001;
        Doctor.speciality = "Cardiology";
        System.out.println("The current doctor is " + Doctor.name);
    }
    public void showName() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(speciality);
    }
}
