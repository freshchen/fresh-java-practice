package spi;

import java.util.ServiceLoader;

/**
 * @author darcy
 * @since 2020/06/12
 **/
public class Test {

    public static void main(String[] args) {
        ServiceLoader<Sport> load = ServiceLoader.load(Sport.class);
        load.forEach(sport -> sport.sport("wang"));
    }
}
