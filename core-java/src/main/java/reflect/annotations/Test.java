package reflect.annotations;

import java.lang.reflect.InvocationTargetException;

public class Test {

    @Hello("World")
    public static void case1(){}

    @Hello
    public static void case2(){}

    public static void case3(){}


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        AnnotationUtil.excute(Test.class, "case1");
        AnnotationUtil.excute(Test.class, "case2");
        AnnotationUtil.excute(Test.class, "case3");
        System.out.println("你好".matches("[\\u4E00-\\u9FA5]+"));
    }
}
