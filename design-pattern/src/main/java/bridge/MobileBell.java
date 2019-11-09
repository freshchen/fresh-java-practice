package bridge;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 13:29
 * @Author: Ling Chen
 * @Description:
 */
public class MobileBell implements MobileSoftware{
    @Override
    public void runApp() {
        System.out.println("The ringing sound of a bell");
    }
}
