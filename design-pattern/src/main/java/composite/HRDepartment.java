package composite;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 22:49
 * @Author: Ling Chen
 * @Description:
 */
public class HRDepartment extends Company{

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display() {
        System.out.println(this.name);
    }
}
