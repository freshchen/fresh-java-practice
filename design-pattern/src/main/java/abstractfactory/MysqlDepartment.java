package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:43
 * @Author: Ling Chen
 * @Description:
 */
public class MysqlDepartment implements Department{
    @Override
    public void insert(Department department) {
        System.out.println("add one Department data to mysql");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("get one Department data form mysql");
        return null;
    }
}
