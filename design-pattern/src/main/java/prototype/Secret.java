package prototype;

import java.io.Serializable;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 23:03
 * @Author: Ling Chen
 * @Description:
 */
public class Secret implements Serializable {

    private static final long serialVersionUID = -7053703557621838498L;
    private String heigth;
    private String weight;

    public String getHeigth() {
        return heigth;
    }

    public void setHeigth(String heigth) {
        this.heigth = heigth;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "heigth='" + heigth + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


}
