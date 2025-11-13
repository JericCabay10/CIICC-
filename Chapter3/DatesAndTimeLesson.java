import java.time.*;

public class DatesAndTimeLesson {
    public static String  dateOrdinalString(LocalDate date) {
        return String.format("%s, %s, %s", date.getDayOfMonth(), date.getMonth(), date.getYear());
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        
        LocalDate date1 = LocalDate.of(1999, 3, 1);
        LocalDate date2 = LocalDate.of(2025, Month.MARCH, 1);

        LocalTime time1 = LocalTime.of(6, 16 );
        LocalTime time2 = LocalTime.of(6, 16, 30);
        LocalTime time3 = LocalTime.of(6, 16, 30, 60);
        
        LocalDateTime dateTime1 = LocalDateTime.of(1999, 3, 1, 6, 16, 30);
        LocalDateTime dateTime2 = Local
        DateTime.of(date1, time1);

        //date plus or minus  - Years, Months, Weeks, Days
        System.out.println(date1.plusDays(41).minusWeeks(3));

        //time plus or minus - hours, minutes, seconds, nano
        System.out.println(time1.plusHours(3).minusSeconds(10));

        //LocalDateTime plus or minus Years, Months, Weeks, Days hours, minutes, seconds, nano
        System.out.println(dateTime1.plusDays(3).plusHours(10));

        int year = Year.now().getValue();
        int birthDate = 1999;



        System.out.println(year - birthDate);
        
        
        LocalDate date3 = LocalDate.of(1999, 3, 1);
        dateOrdinalString(time3);
    }
}
