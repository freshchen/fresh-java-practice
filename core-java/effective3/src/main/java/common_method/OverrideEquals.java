package common_method;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/9 21:19
 * @Author: Ling Chen
 * @Description: 四大原则，不一一举例了，自反性，对称性，传递性，一致性，非空性
 *                 如果继承一个类，并且新增了值属性，重写equals会变得很麻烦，这时候推荐用组合
 */
public class OverrideEquals {

    private final String s;

    public OverrideEquals(String s) {
        this.s = s;
    }

    /**
     * 错误不满足对称性
     * @param obj
     * @return
     */
    public boolean equals1(Object obj) {
        if (obj instanceof OverrideEquals)
            return s.equalsIgnoreCase(((OverrideEquals) obj).s);
        if (obj instanceof String)
            return s.equalsIgnoreCase((String) obj);
        return false;
    }

    /**
     * 正例子
     */
    public boolean equals2(Object obj) {
        return obj instanceof OverrideEquals && ((OverrideEquals) obj).s.equalsIgnoreCase(s);
    }
}
