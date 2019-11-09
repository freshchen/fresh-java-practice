package composite;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 22:52
 * @Author: Ling Chen
 * @Description:
 */
public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
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
