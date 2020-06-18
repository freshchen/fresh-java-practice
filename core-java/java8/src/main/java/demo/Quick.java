package demo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author darcy
 * @since 2020/05/11
 **/
public class Quick {
    public static void main(String[] args) {

//        String s = "12312,123123,12,3,esaf,dsf";
//        Stream.of(",".split(s)).forEach((s1 -> System.out.println(s1)));
        String a = "[asda]";
        String b = "2";
        b = StringUtils.isBlank(b) ? a + StringUtils.EMPTY : a + StringUtils.SPACE + b;
        System.out.println(b);
    }
}
