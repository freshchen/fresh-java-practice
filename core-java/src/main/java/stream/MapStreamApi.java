package stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @anthor LingChen
 * @create 8/19/2019 3:33 PM
 * @Description
 */
public class MapStreamApi {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.forEach( (k, v) -> System.out.print(v));
        System.out.println();
        System.out.println(map.get(3));
        map.computeIfPresent(3, (k, v) -> v + k);
        System.out.println(map.get(3));

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(111));

        System.out.println(map.getOrDefault(111, "no"));

        map.merge(1, "dididi", (oldV, newV) -> oldV.concat(newV));
        System.out.println(map.get(1));
    }
}
