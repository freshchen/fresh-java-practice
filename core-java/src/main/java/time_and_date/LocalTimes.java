package time_and_date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @anthor LingChen
 * @create 8/19/2019 5:13 PM
 * @Description
 */
public class LocalTimes {

    public static void main(String[] args) {
        LocalTime now1 = LocalTime.now(Timezones.getBerlin());
        LocalTime now2 = LocalTime.now(Timezones.getEast());

        System.out.println(now1.getSecond());
        System.out.println(now2.getSecond());

        System.out.println(now1.isBefore(now2));

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);

        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late); // 23:59:59
        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedTime(FormatStyle.SHORT)
                        .withLocale(Locale.GERMAN);
        LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
        System.out.println(leetTime); // 13:37
    }
}
