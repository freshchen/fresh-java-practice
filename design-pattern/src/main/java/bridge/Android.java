package bridge;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 13:33
 * @Author: Ling Chen
 * @Description:
 */
public class Android extends OperatingSystem{
    @Override
    public void runApp() {
        System.out.println("Android");
        getSoftware().runApp();
    }
}
