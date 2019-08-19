package time_and_date;

import java.time.ZoneId;

/**
 * @anthor LingChen
 * @create 8/19/2019 5:08 PM
 * @Description
 */
public class Timezones {

    private static final ZoneId berlin = ZoneId.of("Europe/Berlin");
    private static final ZoneId east = ZoneId.of("Brazil/East");

    public static ZoneId getBerlin() {
        return berlin;
    }

    public static ZoneId getEast() {
        return east;
    }

    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
    }
}
