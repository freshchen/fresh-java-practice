package generic;

import java.util.HashMap;

/**
 * @anthor LingChen
 * @create 6/17/2019 5:25 PM
 * @Description
 */
public class MethodChainingConfigTest extends MethodChainingConfig {

    public static void main(String[] args) {
        HashMap<String, String> stroy = new HashMap();
        stroy.put("1", "ni hao ");
        stroy.put("2", "ta hao");
        MethodChainingConfig test = new MethodChainingConfigTest().age(12).name("ling").story(stroy);
        System.out.println(test.toString());
    }
}
