package proxy.demo1.state;

/**
 * @program: fresh-java-practice
 * @Date: 2019/11/9 22:37
 * @Author: Ling Chen
 * @Description:
 */
public class Test {
    public static void main(String[] args){
        Proxy proxy = ProxyFactory.getLifeServiceProxy(WhiteBear.class);
        String result = proxy.sleep();
        System.out.println(result);
    }

    /**
     * 输出：
     * 快看这里有只冬眠的北极熊！
     * Zzzzzzz
     */
}
