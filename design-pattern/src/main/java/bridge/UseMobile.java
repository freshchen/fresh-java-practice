package bridge;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 13:34
 * @Author: Ling Chen
 * @Description: 尽量使用is-a关系，将软件用组合方式注入操作系统，方便扩展
 */
public class UseMobile {
    public static void main(String[] args) {
        OperatingSystem mobile1 = new IOS();
        mobile1.setSoftware(new MobileBell());
        mobile1.runApp();
        mobile1.setSoftware(new MobileGame());
        mobile1.runApp();

        OperatingSystem mobile2 = new Android();
        mobile2.setSoftware(new MobileBell());
        mobile2.runApp();
        mobile2.setSoftware(new MobileGame());
        mobile2.runApp();
    }
}
