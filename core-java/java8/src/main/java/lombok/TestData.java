package lombok;

import java.time.Instant;

/**
 * @author darcy
 * @since 2020/03/13
 **/

@Builder
public class TestData {
    private String name;

    public static void main(String[] args) {
        long epochSecond = Instant.now().getEpochSecond();
        System.out.println(epochSecond);
    }
}
