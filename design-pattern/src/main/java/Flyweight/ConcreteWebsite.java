package Flyweight;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 16:07
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteWebsite implements Website{

    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void user(User user) {
        System.out.println("website : " + getName() + " user : " + user.getName());
    }
}
