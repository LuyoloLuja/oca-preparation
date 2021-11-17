package core_java_api.dates_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDatesAndTime {
//    as with the ArrayList, we need to import the date and time to work with it
//    most of them are in the java.time package
    public static void main(String[] args) {
//        LocalDate - contains just a date, no time and no time zone
//        LocalTime - contains just time, no date and no time zone
//        LocalDateTime - contains both a date and time, but no time zone
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());    // java uses T to separate date from time

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date2);

//        when you create time, you can choose how specific you want to be
//        you can add hours, minutes, seconds and/or nanoseconds
        LocalTime time = LocalTime.of(12, 30); // hour and minutes
        LocalTime time1 = LocalTime.of(12, 30, 30); // + seconds
        LocalTime time2 = LocalTime.of(12, 30, 30, 200); // + nanoseconds

//        we can combine date and time
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time);
        System.out.println(dateTime);


    }
}
