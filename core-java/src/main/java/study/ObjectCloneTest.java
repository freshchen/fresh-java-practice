package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @anthor LingChen
 * @create 10/12/2019 1:07 PM
 * @Description
 */
public class ObjectCloneTest {


    /**
     * 不实现 Cloneable 接口
     *
     * 输出：
     * Exception in thread "main" java.lang.CloneNotSupportedException: study.ObjectCloneTest$Obj
     * 	at java.lang.Object.clone(Native Method)
     * 	at study.ObjectCloneTest$Obj.main(ObjectCloneTest.java:24)
     */
    private static class Obj {
        public static void main(String[] args) throws CloneNotSupportedException {
            Obj o1 = new Obj();
            Object o2 = o1.clone();
        }
    }

    /**
     * 实现 Cloneable 接口，从结果看出默认实现是浅拷贝
     *
     * 输出：
     * 两个对象地址相同么
     * false
     * 两个对象的属性地址相同么
     * true
     * 改变其中一个属性会变么？
     * [1, 2]
     * [1, 2]
     */
    private static class ObjShallowCopy implements Cloneable {

        private List<String> list = new ArrayList<>();

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public static void main(String[] args) throws CloneNotSupportedException {
            ObjShallowCopy o1 = new ObjShallowCopy();
            o1.list.add("1");
            ObjShallowCopy o2 = (ObjShallowCopy) o1.clone();
            System.out.println("两个对象地址相同么");
            System.out.println(o1 == o2);
            System.out.println("两个对象的属性地址相同么");
            System.out.println(o1.list == o2.list);
            System.out.println("改变其中一个属性会变么？");
            o2.list.add("2");
            System.out.println(o1.list.toString());
            System.out.println(o2.list.toString());

        }

    }

    /**
     * 实现 Cloneable 接口，比较笨拙的做了一层深拷贝，只为了演示，深拷贝也可以通过序列号等方式实现
     *
     * 输出：
     * 两个对象地址相同么
     * false
     * 两个对象的属性地址相同么
     * false
     * 改变其中一个属性会变么？
     * [1]
     * [1, 2]
     */
    private static class ObjDeepCopy implements Cloneable {

        private List<String> list = new ArrayList<>();

        @Override
        protected Object clone() throws CloneNotSupportedException {
            ObjDeepCopy obj = (ObjDeepCopy) super.clone();
            List<String> list = new ArrayList<>(obj.list.size());
            list.addAll(obj.list);
            obj.list = list;
            return obj;
        }

        public static void main(String[] args) throws CloneNotSupportedException {
            ObjDeepCopy o1 = new ObjDeepCopy();
            o1.list.add("1");
            ObjDeepCopy o2 = (ObjDeepCopy) o1.clone();
            System.out.println("两个对象地址相同么");
            System.out.println(o1 == o2);
            System.out.println("两个对象的属性地址相同么");
            System.out.println(o1.list == o2.list);
            System.out.println("改变其中一个属性会变么？");
            o2.list.add("2");
            System.out.println(o1.list.toString());
            System.out.println(o2.list.toString());

        }

    }
}
