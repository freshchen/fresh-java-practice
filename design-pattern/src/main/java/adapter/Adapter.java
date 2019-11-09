package adapter;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 21:36
 * @Author: Ling Chen
 * @Description:
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void getResult() {
        adaptee.getState();
    }
}
