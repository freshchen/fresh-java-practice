package flow;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author darcy
 * @since 2020/11/4
 **/
public class VarHandleTest {

    private volatile int count;

    private AtomicInteger atomicInteger = new AtomicInteger(0);;

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

    public int add2() {
        return atomicInteger.getAndIncrement();
    }


    public static void main(String[] args) {
        VarHandleTest test = new VarHandleTest();
        new MockConcurrency(5000000, 50).mockSingle(test::add);
        System.out.println("test add count: " + test.count);

        VarHandleTest test2 = new VarHandleTest();
        new MockConcurrency(5000000, 50).mockSingle(test2::add2);
        System.out.println("test2 add count: " + test2.atomicInteger);

        VarHandleTest test1 = new VarHandleTest();
        new MockConcurrency(5000000, 50).mockSingle(test1::getAndIncrease);
        System.out.println("test1 add count: " + test1.count);
    }

}
