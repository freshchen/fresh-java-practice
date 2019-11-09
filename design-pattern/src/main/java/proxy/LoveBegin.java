package proxy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 19:40
 * @Author: Ling Chen
 * @Description:
 */
public class LoveBegin {

    public static void main(String[] args) {
        Pursuing pursuing = new Pursuing();
        pursuing.setName("San Kong");
        PursueProxy pursueProxy = new PursueProxy(pursuing);
        pursueProxy.cream();
        pursueProxy.flower();
        pursueProxy.lipstick();
    }
}
