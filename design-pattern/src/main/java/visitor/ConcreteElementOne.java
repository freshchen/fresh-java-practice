package visitor;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 20:07
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteElementOne implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementOne(this);
    }
}
