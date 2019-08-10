package common_method;

import java.util.Comparator;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/10 20:59
 * @Author: Ling Chen
 * @Description:
 */
public class OverrideCompare implements Comparable <OverrideCompare> {
    private int aInt;
    private int bInt;
    private int cInt;

    private static final Comparator <OverrideCompare> OVERRIDE_COMPARE_COMPARABLE = Comparator
            .comparingInt((OverrideCompare o) -> o.aInt)
            .thenComparingInt(o -> o.bInt)
            .thenComparingInt(o -> o.cInt);

    @Override
    public int compareTo(OverrideCompare o) {
        return OVERRIDE_COMPARE_COMPARABLE.compare(this, o);
    }

//    /**
//     * 这种性能高，在比较时候避免用<>，应该使用基本类型的compare方法
//     * @param o
//     * @return
//     */
//    @Override
//    public int compareTo(OverrideCompare o) {
//        int result = Integer.compare(aInt, o.aInt);
//        if (result == 0)
//            result = Integer.compare(bInt, o.bInt);
//            if (result == 0)
//                result = Integer.compare(cInt, o.cInt);
//        return result;
//    }
}
