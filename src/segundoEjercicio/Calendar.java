package segundoEjercicio;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Calendar {
    private static List<LocalDate> currentDate = Dates();

    private static List<LocalDate> Dates() {
        List<LocalDate> newDate = new ArrayList<>();
        LocalDate finalDate = LocalDate.now();

        for (int i = 0; i < 30; i++) {
            while (finalDate.getDayOfWeek()== DayOfWeek.SATURDAY || finalDate.getDayOfWeek()== DayOfWeek.SUNDAY) {
                finalDate = finalDate.plusDays(1);
            }
            newDate.add(finalDate);
            finalDate = finalDate.plusDays(1);
        }
        return newDate;
    }
    public static List<LocalDate> getDates() {
        System.out.println("Available dates: " + currentDate);
        return currentDate;
    }
}

