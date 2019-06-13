package concurrency.security;

import concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @program: fresh-languages
 * @Date: 2019/6/2 13:15
 * @Author: Ling Chen
 * @Description:
 */
@NotThreadSafe
public class UnsafePublish {

    private String[] names = {"san", "kong"};

    public String[] getNames() {
        return names;
    }
}

@Slf4j
class UnsafePublishTest {
    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        log.info("{} ", Arrays.toString(unsafePublish.getNames()));
        unsafePublish.getNames()[0] = "si";
        log.info("{} ", Arrays.toString(unsafePublish.getNames()));
    }
}
