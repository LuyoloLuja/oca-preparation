package core_java_api.dates_time;

import java.time.*;

public class WorkingWithPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH,30);
        Period period = Period.ofMonths(1);

        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndAWeek = Period.of(1, 0, 7);
//        you cannot chain Period methods because they are static, if you do,
//        it will take the last method

        performAnimalEnrichment(start, end, everyThreeWeeks);

//        objects to use Period with
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period1 = Period.ofMonths(1);
        System.out.println(date.plus(period1));     // 2015-02-20
        System.out.println(dateTime.plus(period1)); // 2015-02-20T06:15
        System.out.println(time.plus(period1));     // RuntimeException - UnsupportedTemporalTypeException
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;

        while (upTo.isBefore(end)) {
            System.out.println("Give new toy in: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
