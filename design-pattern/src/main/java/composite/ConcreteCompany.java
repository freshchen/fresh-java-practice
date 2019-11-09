package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 22:28
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteCompany extends Company {

    private List <Company> companies = new ArrayList <>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    @Override
    public void display() {
        System.out.println(this.name);
        for (Company company: companies){
            company.display();
        }
    }
}
