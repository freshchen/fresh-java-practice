package mediator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 15:20
 * @Author: Ling Chen
 * @Description:
 */
public class Forum {
    public static void main(String[] args) {
        SecurityCouncil security = new SecurityCouncil();

        USA usa = new USA(security);
        China china = new China(security);

        security.setChina(china);
        security.setUsa(usa);

        china.declare("peace");
        usa.declare("love");
    }
}
