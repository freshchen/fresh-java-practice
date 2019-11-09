package strategy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 22:29
 * @Author: Ling Chen
 * @Description:
 */
public class PayNormal implements PayStrategy{

    public double acceptCash(double cash) {
        return cash;
    }
}
