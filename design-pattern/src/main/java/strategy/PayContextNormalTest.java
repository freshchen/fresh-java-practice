package strategy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 22:48
 * @Author: Ling Chen
 * @Description: 纯策略模式
 */
public class PayContextNormalTest {

    double getResult(double cash, String payStrategy) {
        PayContextNormal contextNormal = null;
        if ("normal".equals(payStrategy)) {
            contextNormal = new PayContextNormal(new PayNormal());
        } else if ("rebate".equals(payStrategy)) {
            contextNormal = new PayContextNormal(new PayRebate(0.8));
        } else if ("retrun".equals(payStrategy)) {
            contextNormal = new PayContextNormal(new PayRetrun(300, 50));
        }
        return contextNormal.contextPayWay(cash);
    }

    public static void main(String[] args) {

        PayContextNormalTest test = new PayContextNormalTest();
        System.out.println(test.getResult(1000,"retrun"));
    }
}
