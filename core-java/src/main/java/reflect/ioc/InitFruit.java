package reflect.ioc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @anthor LingChen
 * @create 2018-07-03-16:11
 * 操作属性文件类
 */
public class InitFruit {

    public static Properties getProperty() throws IOException {

        Properties property = new Properties();
        InputStream input = new FileInputStream(new File("core-java/src/main/resources/", "fruit.properties"));
        property.load(input);
        return property;
    }
}
