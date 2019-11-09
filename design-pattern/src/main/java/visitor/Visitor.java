package visitor;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 20:05
 * @Author: Ling Chen
 * @Description:
 */
public interface Visitor {

    public void visitConcreteElementOne(ConcreteElementOne concreteElementOne);

    public void visitConcreteElementTwo(ConcreteElementTwo concreteElementTwo);
}
