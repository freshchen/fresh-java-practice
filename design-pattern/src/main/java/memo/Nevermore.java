package memo;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 20:48
 * @Author: Ling Chen
 * @Description:
 */
public class Nevermore {

    private int healthPoint = 435;
    private int magicPoint = 234;

    public RoleMemento save() {
        return new RoleMemento(healthPoint, magicPoint);
    }

    public void rollback(RoleMemento roleMemento) {
        this.healthPoint = roleMemento.getHealthPoint();
        this.magicPoint = roleMemento.getMagicPoint();
    }

    @Override
    public String toString() {
        return "Nevermore{" +
                "healthPoint=" + healthPoint +
                ", magicPoint=" + magicPoint +
                '}';
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
