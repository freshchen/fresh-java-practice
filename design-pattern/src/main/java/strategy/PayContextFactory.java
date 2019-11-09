package strategy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/17 0:07
 * @Author: Ling Chen
 * @Description:
 */
public class PayContextFactory {

    private PayStrategy payStrategy;

    PayContextFactory(String type){
        if ("normal".equals(type)) {
            payStrategy = new PayNormal();
        } else if ("rebate".equals(type)) {
            payStrategy = new PayRebate(0.8);
        } else if ("retrun".equals(type)) {
            payStrategy = new PayRetrun(300, 50);
        }
    }

    public double getResult(double cash){
        return payStrategy.acceptCash(cash);
    }
}
