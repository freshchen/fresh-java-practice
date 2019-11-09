package proxy;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 19:20
 * @Author: Ling Chen
 * @Description:
 */
public class PursueProxy implements Pursue {

    private Pursuer pursuer = null;

    public PursueProxy(Pursuing pursuing) {
        this.pursuer = new Pursuer(pursuing);
    }

    public void flower() {
        pursuer.flower();
    }

    public void lipstick() {
        pursuer.lipstick();
    }

    public void cream() {
        pursuer.cream();
    }
}
