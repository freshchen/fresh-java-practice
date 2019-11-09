package simplefactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 0:05
 * @Author: Ling Chen
 * @Description:
 */
public abstract class Operation {

    private double numberOne;
    private double numberTwo;

    public abstract double getResult();

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
}
