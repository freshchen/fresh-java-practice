package iterator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/23 20:22
 * @Author: Ling Chen
 * @Description:
 */
public class CallRoll {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        MyIterator iter = aggregate.getIterator();
        while ( iter.hasNext()){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }


    }
}
