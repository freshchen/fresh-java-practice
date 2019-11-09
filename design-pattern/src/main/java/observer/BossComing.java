package observer;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 20:51
 * @Author: Ling Chen
 * @Description:
 */
public class BossComing {

    public static void main(String[] args) {
        Scout scout = new Scout();
        scout.add(new Programmer("xiao wang", scout));
        scout.add(new Programmer("xiao zhang",scout));
        scout.setBossState("Boss Coming ! ! !");
        scout.notifyLaborUnion();
    }
}
