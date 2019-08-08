package create_and_destory;

import java.util.Map;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/8 22:05
 * @Author: Ling Chen
 * @Description: 如果一个类依赖其他底层资源，使用依赖注入
 */
public class DependencyInjection {

    private final Map dictionary;

    public DependencyInjection(Map dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word){
        return dictionary.containsKey(word);
    }
}
