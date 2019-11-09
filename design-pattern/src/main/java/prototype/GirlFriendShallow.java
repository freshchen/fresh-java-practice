package prototype;

import java.util.ArrayList;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 22:24
 * @Author: Ling Chen
 * @Description:
 */
public class GirlFriendShallow implements Cloneable{

    private String name;
    private ArrayList <String> hobbies;
    private Secret secrets;

    public String getName() {
        return name;
    }

    public Secret getSecrets() {
        return secrets;
    }

    public void setSecrets(Secret secrets) {
        this.secrets = secrets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList <String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList <String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    protected GirlFriendShallow clone() {
        GirlFriendShallow object = null;
        try {
            object = (GirlFriendShallow) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public String toString() {
        return "GirlFriendShallow{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", secrets=" + secrets +
                '}';
    }
}
