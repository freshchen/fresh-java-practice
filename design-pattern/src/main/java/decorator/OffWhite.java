package decorator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 15:46
 * @Author: Ling Chen
 * @Description:
 */
public class OffWhite extends FineryDecorator{

    public OffWhite(Person person) {
        super(person);
    }


    @Override
    public void show() {
        super.show();
        System.out.println("Wear OFF WHITE pants ... ");
    }

}
