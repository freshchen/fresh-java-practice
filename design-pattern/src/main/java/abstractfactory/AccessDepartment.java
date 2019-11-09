package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:44
 * @Author: Ling Chen
 * @Description:
 */
public class AccessDepartment implements Department{
    @Override
    public void insert(Department department) {
        System.out.println("add one Department data to Access");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("get one Department data form Access");
        return null;
    }
}
