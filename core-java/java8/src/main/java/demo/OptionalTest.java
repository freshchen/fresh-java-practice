package demo;

import java.util.Optional;

/**
 * @author darcy
 * @since 2020/06/12
 **/
public class OptionalTest {

    public static void main(String[] args) {
        Optional<Person> person = Optional.ofNullable(null);
        boolean needSkip = person.map(value -> value.getName().equals("wang")).orElse(false);
        System.out.println(needSkip);
    }

}
