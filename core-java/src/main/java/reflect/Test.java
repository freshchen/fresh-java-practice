package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import reflect.constructor.Person;

public class Test {

    public static void name(Class clz) {
        System.out.println("########## name ##########");

        System.out.println(clz.getName());
        System.out.println(clz.getSimpleName());

        System.out.println();
    }

    public static void modifiers(Class clz) {
        System.out.println("########## modifiers ##########");

        int modifiers = clz.getModifiers();
        System.out.println(Modifier.isFinal(modifiers));
        System.out.println(modifiers);

        System.out.println();
    }

    public static void pkg(Class clz) {
        System.out.println("########## Package ##########");

        Package pkg = clz.getPackage();
        System.out.println(pkg.getName());
        System.out.println(pkg.toString());

        System.out.println();
    }

    public static void constructor(Class clz) {
        System.out.println("########## constructor  ##########");

        Constructor[] constructors = clz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.toString());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class clz = Person.class;
        Test.name(clz);
        Test.modifiers(clz);
        Test.pkg(clz);
        Test.constructor(clz);

    }
}
