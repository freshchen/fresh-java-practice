package memo;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 20:50
 * @Author: Ling Chen
 * @Description:
 */
public class RoleMemento {

    private int healthPoint;
    private int magicPoint;

    public RoleMemento(int healthPoint, int magicPoint) {
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }
}
