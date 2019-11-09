package simplefactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 0:13
 * @Author: Ling Chen
 * @Description:
 */
public class OptSub extends Operation{
    public double getResult() {
        return super.getNumberOne() - super.getNumberTwo();
    }
}
