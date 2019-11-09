package proxy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 19:21
 * @Author: Ling Chen
 * @Description:
 */
public class Pursuer implements Pursue {

    private Pursuing pursuing = null;

    public Pursuer(Pursuing pursuing) {
        this.pursuing = pursuing;
    }

    public void flower() {
        System.out.println(pursuing.getName() + " Here are your 99 roses");
    }

    public void lipstick() {
        System.out.println(pursuing.getName() + " Here are your TF");
    }

    public void cream() {
        System.out.println(pursuing.getName() + " Here are your Lamer");
    }
}
