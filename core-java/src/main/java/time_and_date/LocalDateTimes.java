package time_and_date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * @anthor LingChen
 * @create 8/19/2019 5:39 PM
 * @Description
 */
public class LocalDateTimes {

    public static void main(String[] args) {
        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER,
                31, 23, 59, 59);
        DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        System.out.println(dayOfWeek); // WEDNESDAY
        Month month = sylvester.getMonth();
        System.out.println(month); // DECEMBER
        long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay); // 1439

        Instant instant = sylvester
                .atZone(ZoneId.systemDefault())
                .toInstant();
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);

        DateTimeFormatter formatter =
                DateTimeFormatter
                        .ofPattern("MMM dd, yyyy - HH:mm");
        LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13"
                , formatter);
        String string = formatter.format(parsed);
        System.out.println(string);

    }
}
