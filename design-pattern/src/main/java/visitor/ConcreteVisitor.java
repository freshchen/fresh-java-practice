package visitor;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 20:11
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteVisitor implements Visitor{
    @Override
    public void visitConcreteElementOne(ConcreteElementOne concreteElementOne) {
        System.out.println("element: " + concreteElementOne.getClass().getName() + "visitor: " + this.getClass().getName());
    }

    @Override
    public void visitConcreteElementTwo(ConcreteElementTwo concreteElementTwo) {
        System.out.println("element: " + concreteElementTwo.getClass().getName() + "visitor: " + this.getClass().getName());
    }
}
