package flow;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

/**
 * @author darcy
 * @since 2020/11/4
 **/
public class VarHandleTest {

    private volatile int count;

    private static final VarHandle COUNT;

    static {
        try {
            MethodHandles.Lookup l = MethodHandles.lookup();
            COUNT = l.findVarHandle(VarHandleTest.class, "count", int.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public int getAndIncrease() {
        return (int) COUNT.getAndAdd(this, 1);
    }

    public int add() {
        return count++;
    }


    public static void main(String[] args) {
        VarHandleTest test = new VarHandleTest();
        new MockConcurrency(5000, 50).mockSingle(test::add);
        System.out.println("test add count: " + test.count);

        VarHandleTest test1 = new VarHandleTest();
        new MockConcurrency(5000, 50).mockSingle(test1::getAndIncrease);
        System.out.println("test1 add count: " + test1.count);
    }

}
