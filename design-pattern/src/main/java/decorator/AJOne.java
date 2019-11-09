package decorator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 15:39
 * @Author: Ling Chen
 * @Description:
 */
public class AJOne extends FineryDecorator {

    public AJOne(Person person) {
        super(person);
    }


    @Override
    public void show() {
        super.show();
        System.out.println("Break AJ One ... ");

    }
}
