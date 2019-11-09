package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: fresh-java-practice
 * @Date: 2019/10/19 18:29
 * @Author: Ling Chen
 * @Description:
 */
public class MyUtils {

    public static Integer sortPersonByAge(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }

    public static void main(String[] args) {
        Person person1 = new Person("wang", 25);
        Person person2 = new Person("li", 20);
        Person person3 = new Person("li", 30);
        List <Person> personArray = Arrays.asList(person1, person2, person3);
        System.out.println(personArray.toString());

        Collections.sort(personArray, MyUtils::sortPersonByAge);
        System.out.println(personArray.toString());

    }
}
