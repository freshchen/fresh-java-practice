package lambda.anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: fresh-languages
 * @Date: 2019/5/26 23:26
 * @Author: Ling Chen
 * @Description:
 */
public class ArrayCompare {

    public void compare1(List list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null)
                    return -1;
                if (o2 == null)
                    return 1;
                return o1.length() - o2.length();
            }
        });
    }

    public void compare2(List list){
        Collections.sort(list, (String o1, String o2) -> {
            if (o1 == null)
                return -1;
            if (o2 == null)
                return 1;
            return o1.length() - o2.length();
        });
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("every", "body", "fucking", "jump");
        list.forEach(System.out::println);
        ArrayCompare compare = new ArrayCompare();
        compare.compare2(list);
        list.forEach(System.out::println);
    }
}
