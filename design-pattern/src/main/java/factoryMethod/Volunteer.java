package factoryMethod;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 21:44
 * @Author: Ling Chen
 * @Description:
 */
public class Volunteer implements PublicBenefit{
    public void sweep() {
        System.out.println("I am a Volunteer to help sweep");
    }

    public void wash() {
        System.out.println("I am a Volunteer to help wash");
    }
}
