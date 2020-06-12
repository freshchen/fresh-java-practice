package spi.impl;

import spi.Sport;

/**
 * @author darcy
 * @since 2020/06/12
 **/
public class Pingpong implements Sport {
    @Override
    public void sport(String person) {
        System.out.println("Pingpong " + person);
    }
}
