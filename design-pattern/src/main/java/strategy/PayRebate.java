package strategy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 22:32
 * @Author: Ling Chen
 * @Description:
 */
public class PayRebate implements PayStrategy{

    private double rebate = 1.0;

    public PayRebate(double rebate){
        this.rebate = rebate;
    }

    public double acceptCash(double cash) {
        return cash * rebate;
    }
}
