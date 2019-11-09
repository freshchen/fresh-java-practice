package bit;

/**
 * @program: fresh-java-practice
 * @Date: 2019/9/28 21:48
 * @Author: Ling Chen
 * @Description:
 */
public class BitTest {
    public static void main(String[] args) {
        int num = 213;
        int len = 8;
        System.out.println(num % len);

        System.out.println(num & (len - 1));
    }
}
