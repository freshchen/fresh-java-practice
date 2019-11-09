package visitor;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 20:09
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteElementTwo implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementTwo(this);
    }
}
