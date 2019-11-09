package strategy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 22:35
 * @Author: Ling Chen
 * @Description:
 */
public class PayRetrun implements PayStrategy{

    private double conditionCash = 0.0;
    private double retrunCash = 0.0;

    public PayRetrun(double conditionCash, double retrunCash) {
        this.conditionCash = conditionCash;
        this.retrunCash = retrunCash;
    }

    public double acceptCash(double cash) {
        double result = cash;
        if (cash > this.conditionCash){
            result = result - Math.floor(cash / conditionCash) * retrunCash;
        }
        return result;
    }
}
