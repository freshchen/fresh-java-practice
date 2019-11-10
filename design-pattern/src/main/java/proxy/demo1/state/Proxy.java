package proxy.demo1.state;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 22:34
 * @Author: Ling Chen
 * @Description:
 */
public class Proxy implements LifeService {

    // 被代理对象行为
    private LifeService target;

    public Proxy(LifeService target) {
        this.target = target;
    }

    @Override
    public String sleep() {
        // 拿到被代理对象行为的返回值，加上辅助功能，一起返回
        return "快看这里有只冬眠的北极熊！ \n" + this.target.sleep();
    }
}
