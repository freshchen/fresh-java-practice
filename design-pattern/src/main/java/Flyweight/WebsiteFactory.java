package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 16:10
 * @Author: Ling Chen
 * @Description:
 */
public class WebsiteFactory {

    private Map<String, Website> flyweights = new HashMap <>();

    public Website getWebsiteCategory(String key){
        if (!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }

    public Map <String, Website> getFlyweights() {
        return flyweights;
    }
}
