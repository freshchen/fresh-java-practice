package Flyweight;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 16:05
 * @Author: Ling Chen
 * @Description:
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
