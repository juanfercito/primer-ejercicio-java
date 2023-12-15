package segundoEjercicio;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Calendar {
    // public static List<LocalDateTime> genDatesToDoctor;
    private static List<LocalDateTime> vacantDates = createDates();
    static {
        vacantDates.addAll(createDates());
    }

    private static List<LocalDateTime> createDates() {
        List<LocalDateTime> Dates = new ArrayList<>();
        LocalDateTime currentDate = LocalDateTime.now();

        for (int i = 0; i < 30; i++) {
            while (currentDate.getDayOfWeek().getValue() >= 6) {
                currentDate = currentDate.plusDays(1);
            }

            LocalDateTime dateAndTime9am = currentDate.with(LocalTime.of(9,0));
            LocalDateTime dateAndTime10am = currentDate.with(LocalTime.of(10,0));
            LocalDateTime dateAndTime11am = currentDate.with(LocalTime.of(11,0));
            Dates.add(dateAndTime9am);
            Dates.add(dateAndTime10am);
            Dates.add(dateAndTime11am);
            currentDate = currentDate.plusDays(1);
        }
        return Dates;
    }
    public static List<LocalDateTime> getDates() {
        System.out.println("Available dates: ");
        return vacantDates;
    }
    public static void availDate() {
        List<LocalDateTime> dates = getDates();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm a");
        for (LocalDateTime date : getDates()) {
            String formatDate = date.format(formatter);
            System.out.println("- " + formatDate);
        }
    }
    public static List<LocalDateTime> genDatesToDoctor() {
        List<LocalDateTime> datesDoctor = createDates();
        vacantDates.addAll(datesDoctor);
        return datesDoctor;
    }
}

