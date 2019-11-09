package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:52
 * @Author: Ling Chen
 * @Description:
 */
public class MysqlFactory implements DatabaseFactory{
    @Override
    public User createUser() {
        return new MysqlUser();
    }

    @Override
    public Department createDepartment() {
        return new MysqlDepartment();
    }
}
