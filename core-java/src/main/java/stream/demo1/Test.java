package stream.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/12 22:34
 * @Author: Ling Chen
 * @Description:
 */
public class Test {

    private static void echo(String name, String... moneys){

        System.out.println();
    }


    public static void main(String[] args) {
        Man man1 = new Man("1111", "zhu1");
        Man man2 = new Man("11111", "zhu2");
        Man man3 = new Man("111111", "zhu3");
        Man man4 = new Man("1111111", "zhu4");
        Man man5 = new Man("11111111", "zhu5");
        Home home1 = new Home("home1", Arrays.asList(man1, man2, man3, man4, man5));
        Home home2 = new Home("home2", Arrays.asList(man1, man2, man3, man4, man5));
        List <Home> homes = Arrays.asList(home1, home2);

        Map <String, List <String>> listMap = homes.stream()
                .collect(Collectors.toMap(
                        Home::getHomeName,
                        home -> home.getMen().stream()
                                .map(Man::getMoney)
                                .collect(Collectors.toList())
                ));

        listMap.entrySet().stream().forEach(
                item -> {
                    System.out.println(item.getKey());
                    System.out.println(item.getValue());
                }
        );

    }
}
