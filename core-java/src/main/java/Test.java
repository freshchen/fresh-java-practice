import java.lang.reflect.Field;

/**
 * @program: fresh-java-practice
 * @Date: 2019/10/13 22:45
 * @Author: Ling Chen
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ThreadLocal local = new ThreadLocal();
        Field field = local.getClass().getDeclaredField("threadLocalHashCode");
        field.setAccessible(true);
        System.out.println(field.get(local));

        new Thread(()->{
            ThreadLocal local1 = new ThreadLocal();
            Field field1 = null;
            try {
                field1 = local1.getClass().getDeclaredField("threadLocalHashCode");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            field.setAccessible(true);
            try {
                System.out.println(field.get(local1));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
