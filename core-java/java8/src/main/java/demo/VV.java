package demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author darcy
 * @since 2020/02/13
 **/
@AllArgsConstructor
@Getter
public enum VV {

    KE2("颗", 47),
    OTHERS("其他", 99);

    private String name;
    private int value;

}
