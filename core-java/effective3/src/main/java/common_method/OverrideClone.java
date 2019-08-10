package common_method;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/10 17:07
 * @Author: Ling Chen
 * @Description:
 */

public class OverrideClone implements Cloneable{

    private String name;

    @Override
    protected OverrideClone clone() throws CloneNotSupportedException {
        OverrideClone result = (OverrideClone) super.clone();
        result.name = this.name;
        return result;
    }

    public static OverrideClone copy(OverrideClone old){
        OverrideClone result = new OverrideClone();
        result.name = old.name;
        return result;
    }
}
