package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:53
 * @Author: Ling Chen
 * @Description:
 */
public class AcceessFactory implements DatabaseFactory{
    @Override
    public User createUser() {
        return new AccessUser();
    }

    @Override
    public Department createDepartment() {
        return new AccessDepartment();
    }
}
