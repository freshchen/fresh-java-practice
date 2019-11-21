package lambda.anonymous;

import java.util.HashMap;

/**
 * @program: fresh-languages
 * @Date: 2019/5/27 22:45
 * @Author: Ling Chen
 * @Description:
 */
public class MapApi {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        // 使用forEach()结合Lambda表达式迭代Map
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        // 查询Map中指定的值，不存在时使用默认值
        System.out.println(map.getOrDefault(4, "NoFour"));
        // 只有在当前Map中**key正好映射到value时**才删除该映射，否则什么也不做．
        map.remove(1,"two");
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        // 将原来映射关系中的单词都转换成大写．
        map.replaceAll((k, v) -> v.toUpperCase());
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        // 在Value后追加字符串；
        map.merge(3, " Plus", (s1, s2) -> s1 + s2);
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
