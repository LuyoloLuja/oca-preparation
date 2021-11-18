package core_java_api_3.dates_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesTime {
//    date and time support many methods to get data out of them
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

//        using format
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date));
//        System.out.println(shortDateTime.format(time));     // RuntimeException

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF);
        System.out.println(mediumF);

//        creating own format style
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(f);

//        parsing date and time
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date2 = LocalDate.parse("01 02 2015", f2);
        LocalTime time1 = LocalTime.parse("11:22");
        System.out.println(date2);
        System.out.println(time1);
    }
}
