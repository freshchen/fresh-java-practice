package observer;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 20:43
 * @Author: Ling Chen
 * @Description:
 */
public class Programmer implements BossObserver {

    private String bossState;
    private String name;
    private Scout scout;

    public Scout getScout() {
        return scout;
    }

    public void setScout(Scout scout) {
        this.scout = scout;
    }

    public Programmer(String name, Scout scout) {
        this.name = name;
        this.scout = scout;
    }

    @Override
    public void update() {
        bossState = scout.getBossState();
        System.out.printf("observer %s 's new state is %s. ", name, bossState);
        System.out.println();
    }
}
