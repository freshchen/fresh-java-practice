package time_and_date;

import java.time.Clock;

/**
 * @anthor LingChen
 * @create 8/19/2019 5:04 PM
 * @Description
 */
public class Clocks {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());

        String  instant = clock.instant().toString();
        System.out.println(instant);

    }
}
