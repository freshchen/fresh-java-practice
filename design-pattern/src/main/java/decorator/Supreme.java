package decorator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 15:43
 * @Author: Ling Chen
 * @Description:
 */
public class Supreme extends FineryDecorator{

    public Supreme(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Wear Supreme T-shit");
    }
}
