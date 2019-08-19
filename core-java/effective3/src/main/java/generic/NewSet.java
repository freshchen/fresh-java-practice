package generic;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/15 21:54
 * @Author: Ling Chen
 * @Description:
 */
public class NewSet<T> {

    public static <E> Set <E> union(Set <E> set1, Set <E> set2) {
        Set <E> set = new HashSet <>(set1);
        set.addAll(set2);
        return set;
    }

    public static Set union1(Set set1, Set set2) {
        Set set = new HashSet <>(set1);
        set.addAll(set2);
        return set;
    }

    public static void main(String[] args) {
        Set<String> guys = Set.of("TOM", "DICK", " HARRY");
        Set<String> girls = Set.of("LARRY", "LILY");
        System.out.println(NewSet.union(guys, girls));
    }
}
