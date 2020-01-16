package demo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

/**
 * @author chenling
 */
public class DateTimeDemo {

    public static TemporalAdjuster nextWorkingDay = temporal -> {
        DayOfWeek day = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int dayToAdd = 1;
        if (day == DayOfWeek.FRIDAY) {
            dayToAdd = 3;
        }
        if (day == DayOfWeek.SATURDAY) {
            dayToAdd = 2;
        }
        return temporal.plus(dayToAdd, ChronoUnit.DAYS);
    };

    public static void case1() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
    }

    public static void case2() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.isLeapYear());
    }

    public static void case3() throws InterruptedException {
        Instant instant1 = Instant.now();
        Thread.sleep(2000);
        Instant instant2 = Instant.now();
        System.out.println(instant1.isBefore(instant2));
        Duration duration = Duration.between(instant1, instant2);
        System.out.println(duration.getSeconds());

    }

    public static void case4(){
        System.out.println(LocalDate.now().with(nextWorkingDay).with(nextWorkingDay));
    }

    public static void case5(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date.format(formatter));
    }

    public static void main(String[] args) {
        Utils.invokeAllCases(DateTimeDemo.class);
    }
}
