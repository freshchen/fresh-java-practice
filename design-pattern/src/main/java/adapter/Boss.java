package adapter;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 21:39
 * @Author: Ling Chen
 * @Description:
 */
public class Boss {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.getResult();
    }
}
