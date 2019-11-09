package composite;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 22:23
 * @Author: Ling Chen
 * @Description:
 */
public abstract class Company {

    String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display();

}
