package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.TestData;
import lombok.NoArgsConstructor;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author chenling
 */
public class LambdaDemo {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Person {
        private String name;
        private Integer age;
    }

    public static void case1() {
        new Thread(() -> {
            System.out.println("Hello");
        }).start();
    }

    public static void case2() {
        Function<String, Integer> hash = String::hashCode;
        System.out.println(hash.apply("hello"));
    }

    public static void case3() {
        Person person = new Person("lc", 24);
        Consumer<Person> name = p -> System.out.println(p.getName());
        Consumer<Person> age = p -> System.out.println(p.getAge());
        name.accept(person);
        age.accept(person);
    }

    public static void case4(){
        Predicate<String> lenLessTen = s -> s.length() < 10;
        System.out.println(lenLessTen.test("Hello"));
        System.out.println(lenLessTen.test("Hello World !!!!!!!"));

    }

    public static void case5(){
        Supplier<Person> person = Person::new;
        System.out.println(person.get());
    }

    public static void main(String[] args) {
        Utils.invokeAllCases(LambdaDemo.class);
    }
}
