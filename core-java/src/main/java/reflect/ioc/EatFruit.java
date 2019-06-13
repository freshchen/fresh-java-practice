package reflect.ioc;

import java.io.IOException;
import java.util.Properties;

/**
 * @anthor LingChen
 * @create 2018-07-03-16:22
 * ioc的实现
 */
public class EatFruit {
    public static void main(String[] args) throws IOException {
        Properties property = InitFruit.getProperty();
        String className = property.getProperty("fruit.name");
        Fruit fruit = Factory.getInstance(className);
        if (fruit != null) {
            fruit.eat();
        }
    }
}
