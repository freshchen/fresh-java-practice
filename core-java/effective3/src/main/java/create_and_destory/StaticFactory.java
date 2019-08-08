package create_and_destory;

import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/8 20:51
 * @Author: Ling Chen
 * @Description: 尽量使用简单工厂方法代替工造方法
 */
public class StaticFactory {
    public static void main(String[] args) throws IOException {
        Date.from(Instant.EPOCH);
        BigInteger.valueOf(Integer.MAX_VALUE);
        StackWalker.getInstance();
        /**
         * 每次返回新实例
         */
        Array.newInstance(LinkedList.class, 12);
        Files.getFileStore(Path.of("/var/data/file.txt"));

    }
}
