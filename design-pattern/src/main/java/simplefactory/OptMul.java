package simplefactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 0:15
 * @Author: Ling Chen
 * @Description:
 */
public class OptMul extends Operation {
    public double getResult() {
        return super.getNumberOne() * super.getNumberTwo();
    }
}
