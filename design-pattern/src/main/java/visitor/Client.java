package visitor;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 20:21
 * @Author: Ling Chen
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementOne());
        objectStructure.attach(new ConcreteElementTwo());

        Visitor visitor1 = new ConcreteVisitor();
        Visitor visitor2 = new ConcreteVisitor();

        objectStructure.accept(visitor1);
        objectStructure.accept(visitor2);
    }
}
