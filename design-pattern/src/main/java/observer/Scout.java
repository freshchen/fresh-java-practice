package observer;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 20:39
 * @Author: Ling Chen
 * @Description:
 */
public class Scout extends LaborUnionSubject {

    private String bossState;

    public String getBossState() {
        return bossState;
    }

    public void setBossState(String bossState) {
        this.bossState = bossState;
    }
}
