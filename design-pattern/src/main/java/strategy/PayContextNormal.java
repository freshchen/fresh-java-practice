package strategy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 22:43
 * @Author: Ling Chen
 * @Description:
 */
public class PayContextNormal {

    private PayStrategy payStrategy;

    public PayContextNormal(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public double contextPayWay(double cash){
        return payStrategy.acceptCash(cash);
    }
}
