package prototype;

import java.io.*;
import java.util.ArrayList;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 23:12
 * @Author: Ling Chen
 * @Description:
 */
public class GirlFriendDeep implements Serializable {


    private static final long serialVersionUID = -334325073320184020L;
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

    public GirlFriendDeep deepclone() throws Exception {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象取出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bi);
        return (GirlFriendDeep) ois.readObject();
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
