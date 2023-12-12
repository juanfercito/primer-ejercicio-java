package primerEjercicio;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Selecciones {
    // variables -> statements
    // behaviors -> methods

    // properties -> attributes
    String teamName;
    char group;
    boolean classification;
    void showTeam() {
        System.out.println(teamName);
        System.out.println(group);
        System.out.println(classification);
    }
    public static void main(String[] args) {

        Selecciones colombia = new Selecciones();
        colombia.teamName = "Colombia";
        colombia.group = 'B';
        colombia.classification = false;

        colombia.showTeam();

        int teamNumber = 32;
        System.out.println(teamNumber);

        // conditional statements
        if (colombia.classification == true) {
            System.out.println("classified");
        }
        else System.out.println("not classified");

        // For loop
        for (int i = 1; i < 11; i++) {
            System.out.println("sits " + i);
        }

        //While loop
        int i = 1;
        while (i < 11) {
            System.out.println("sits " + i);
            i++;
        }

        // try catch exceptions
        try {
            System.out.println(teamNumber / 0);
        } catch (Exception error) {
            System.out.println("Exception: Not allowed to divide by zero");
        }

        // Using API
        ArrayList<String> Selecciones = new ArrayList();
        Selecciones.add("Argentina");
        Selecciones.add("Brazil");
        Selecciones.add("Ecuador");
        Selecciones.add("Mexico");

        System.out.println(Selecciones);
    }
}

