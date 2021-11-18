package core_java_api_3.dates_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDateTime {
//    the date and time classes are immutable, just like strings
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);   // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date);   // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date);   // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date);   // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date);   // 2019-02-28

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date2, time);
        System.out.println(dateTime);   // outputs date and time
        dateTime = dateTime.minusDays(1);   // minuses the days
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);     // minuses hours
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);   // minuses seconds
        System.out.println(dateTime);
    }
}
