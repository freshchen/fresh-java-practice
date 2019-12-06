package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @anthor LingChen
 * @create 10/21/2019 5:25 PM
 * @Description
 */
public class Test {
    public static Integer sortPersonByName(Person person1, Person person2) {
        Integer age1 = person1.getAge();
        Integer age2 = person2.getAge();
        return age1.compareTo(age2);
    }
    public static void main(String[] args) {
        Person person1 = new Person("wang", 22);
        Person person2 = new Person("li", 27);
        Person person3 = new Person("zhang", 19);
        List<Person> people = Arrays.asList(person1, person2, person3);

        people.sort(Test::sortPersonByName);
        System.out.println(people);
    }
}
