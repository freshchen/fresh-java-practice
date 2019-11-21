package reflect.classname;

/**
 * @anthor LingChen
 * @create 2018-07-02-22:46
 */
public class ShowClassName {
    public static void main(String[] args) {

        Class<?> demo1 = null;
        Class<?> demo2 = null;
        Class<?> demo3 = null;

        try {
            demo1 = Class.forName("reflect.classname.Demo");
        } catch (Exception e) {
            e.printStackTrace();
        }

        demo2 = new Demo().getClass();
        demo3 = Demo.class;

        System.out.println("Class name is:  " + demo1.getName());
        System.out.println("Class name is:  " + demo2.getName());
        System.out.println("Class name is:  " + demo3.getName());

        System.out.println("Class Simple name is:  " + demo1.getSimpleName());
    }
}
