package bridge;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 13:32
 * @Author: Ling Chen
 * @Description:
 */
public class IOS extends OperatingSystem {
    @Override
    public void runApp() {
        System.out.println("IOS");
        getSoftware().runApp();
    }
}
